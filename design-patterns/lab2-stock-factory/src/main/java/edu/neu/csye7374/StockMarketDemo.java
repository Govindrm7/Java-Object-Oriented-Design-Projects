package edu.neu.csye7374;

public class StockMarketDemo {
    public static void  demo() {
        StockMarket market = StockMarket.getInstance();

        StockFactory amazonFactory = new AmazonStockFactory();
        StockFactory appleFactory = new AppleStockFactory();

        StockFactory lazySingletonNvidiaFactory = LazyNvidiaStockFactory.getInstance();
        StockFactory eagerSingletonAmexFactory = EagerAmexStockFactory.getInstance();
        StockFactory lazySingletonAmazonFactory = LazyAmazonStockFactory.getInstance();
        StockFactory eagerSingletonAppleFactory = EagerAppleStockFactory.getInstance();


        // Create stocks using factories
        Stock amazon = amazonFactory.createStock("AMZN", 2000.0, "Amazon.com Inc.", 0.12);
        Stock apple = appleFactory.createStock("AAPL", 3000.0, "Apple Inc.", 0.15);

        // Create stocks using singleton factories
        Stock nvidia = lazySingletonNvidiaFactory.createStock("NVDA", 200.0, "Nvidia Corporation", 0.12);
        Stock amex = eagerSingletonAmexFactory.createStock("AMX", 100.0, "American Express", 0.0);
        Stock amazon1 = lazySingletonAmazonFactory.createStock("AMZN2", 2100.0, "Amazon.com Inc. (2)", 0.12);
        Stock apple1 = eagerSingletonAppleFactory.createStock("AAPL2", 310.0, "Apple Inc. (2)", 0.15);
        market.addStock(amex);
        market.addStock(nvidia);
        market.addStock(apple);
        market.addStock(apple1);
        market.addStock(amazon);
        market.addStock(amazon1);

        System.out.println("Initial state of stocks:");
        market.showAllStocks();

        double[] amexBids = {105.0, 102.0, 108.0, 106.0, 110.0, 107.0};
        for (double bid : amexBids) {
            System.out.println("\nPlacing bid for AMX: " + bid);
            market.tradeStock("AMX", String.valueOf(bid));
            System.out.println("AMX metric: " + amex.getMetric());
            System.out.println(amex);
        }

        double[] nvidiaBids = {205.0, 202.0, 208.0, 206.0, 210.0, 207.0};
        for (double bid : nvidiaBids) {
            System.out.println("\nPlacing bid for NVDA: " + bid);
            market.tradeStock("NVDA", String.valueOf(bid));
            System.out.println("NVDA metric: " + nvidia.getMetric());
            System.out.println(nvidia);
        }

        double[] appleBids = {105.0, 102.0, 198.0, 136.0, 110.0, 107.0};
        for (double bid : appleBids) {
            System.out.println("\nPlacing bid for AAPL: " + bid);
            market.tradeStock("AAPL", String.valueOf(bid));
            System.out.println("AAPL metric: " + apple.getMetric());
            System.out.println(apple);
        }

        double[] amazonBids = {250.0, 212.0, 280.0, 260.0, 210.0, 270.0};
        for (double bid : amazonBids) {
            System.out.println("\nPlacing bid for AMZN: " + bid);
            market.tradeStock("AMZN", String.valueOf(bid));
            System.out.println("AMZN metric: " + amazon.getMetric());
            System.out.println(amazon);
        }

        System.out.println("\nFinal state of stocks:");
        market.showAllStocks();
    }
}
