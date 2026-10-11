package edu.neu.csye7374;

public class LazyNvidiaStockFactory implements StockFactory {
    private static LazyNvidiaStockFactory instance;

    private LazyNvidiaStockFactory() {}

    public static LazyNvidiaStockFactory getInstance() {
        if (instance == null) {
            instance = new LazyNvidiaStockFactory();
        }
        return instance;
    }

    @Override
    public Stock createStock(String name, Double price, String description, double volatilityFactor) {
        return new NvidiaStock(name, price, description);
    }
}