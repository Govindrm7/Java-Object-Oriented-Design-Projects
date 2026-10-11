package edu.neu.csye7374;

public class StockMarketDemo {
    public static void demo() {
        StockMarket stockMarket = StockMarket.getInstance();
        AmazonStock amazonStock = new AmazonStock("Amazon", 150.51, "Amazon Inc.");
        TeslaStock teslaStock = new TeslaStock("Tesla", 400.23, "Tesla Corp.");
        GoogleStock googleStock = new GoogleStock("Google", 300.23, "Google Corp.");
        MicrosoftStock microsoftStock = new MicrosoftStock("Microsoft", 100.0, "Microsoft");
        AppleStock appleStock = new AppleStock("AAPL", 200.0, "Apple");
        stockMarket.addStock(amazonStock);
        stockMarket.addStock(microsoftStock);
        stockMarket.addStock(appleStock);
        stockMarket.addStock(teslaStock);
        stockMarket.addStock(googleStock);
        System.out.println("Current stocks added to the stock market: ");
        stockMarket.showAllStocks();
        System.out.println();
        double[] amazonBids = new double[] { 155.0, 140.0, 138.0, 145.0, 150.0, 155.0 };
        double[] microsoftBids = new double[] { 205.0, 190.0, 195.0, 210.0, 215.0, 200.0 };
        double[] appleBids = new double[] { 205.0, 202.0, 208.0, 206.0, 210.0, 207.0 };
        double[] teslaBids = new double[] { 401.0, 402.0, 403.0, 404.0, 405.0, 406.0 };
        double[] googleBids = new double[] { 301.0, 302.0, 303.0, 304.0, 305.0, 306.0 };
        System.out.println("Starting trading Amazon Stock");
        double[] var6 = amazonBids;
        int var7 = amazonBids.length;

        int var8;
        double microsoftBid;
        for (var8 = 0; var8 < var7; ++var8) {
            microsoftBid = var6[var8];
            stockMarket.tradeStock(amazonStock, microsoftBid);
            System.out.println(amazonStock);
            System.out.println("Stock metric after bid: " + amazonStock.getMetric());
        }

        System.out.println();
        System.out.println("Starting trading Microsoft Stock");
        var6 = microsoftBids;
        var7 = microsoftBids.length;

        for (var8 = 0; var8 < var7; ++var8) {
            microsoftBid = var6[var8];
            stockMarket.tradeStock(microsoftStock, microsoftBid);
            System.out.println(microsoftStock);
            System.out.println("Stock metric after bid: " + microsoftStock.getMetric());
        }

        System.out.println();
        System.out.println("Starting trading Apple Stock");
        var6 = appleBids;
        var7 = appleBids.length;

        for (var8 = 0; var8 < var7; ++var8) {
            double bid = var6[var8];
            stockMarket.tradeStock(appleStock, bid);
            System.out.println(appleStock);
            System.out.println("Stock metric after bid: " + appleStock.getMetric());
        }

        System.out.println();
        System.out.println("Starting trading Tesla Stock");
        var6 = teslaBids;
        var7 = teslaBids.length;

        for (var8 = 0; var8 < var7; ++var8) {
            double bid = var6[var8];
            stockMarket.tradeStock(teslaStock, bid);
            System.out.println(teslaStock);
            System.out.println("TSLA metric: " + teslaStock.getMetric());
        }
        System.out.println();
        System.out.println("Starting trading Google Stock");
        var6 = googleBids;
        var7 = googleBids.length;

        for (var8 = 0; var8 < var7; ++var8) {
            double bid = var6[var8];
            stockMarket.tradeStock(googleStock, bid);
            System.out.println(googleStock);
            System.out.println("GOOG metric: " + googleStock.getMetric());
        }

        System.out.println();
        System.out.println("All stocks in the market with current price after bids: ");
        stockMarket.showAllStocks();
        stockMarket.removeStock(microsoftStock);
        System.out.println();
        System.out.println("Current stocks in stock market after removing a stock: ");
        stockMarket.showAllStocks();
    }
}
