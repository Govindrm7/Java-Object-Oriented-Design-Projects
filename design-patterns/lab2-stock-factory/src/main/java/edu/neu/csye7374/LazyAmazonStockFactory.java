package edu.neu.csye7374;

public class LazyAmazonStockFactory implements StockFactory {
    private static LazyAmazonStockFactory instance;

    private LazyAmazonStockFactory() {}

    public static LazyAmazonStockFactory getInstance() {
        if (instance == null) {
            instance = new LazyAmazonStockFactory();
        }
        return instance;
    }

    @Override
    public Stock createStock(String name, Double price, String description, double volatilityFactor) {
        return new AmazonStock(name, price, description, volatilityFactor);
    }
}