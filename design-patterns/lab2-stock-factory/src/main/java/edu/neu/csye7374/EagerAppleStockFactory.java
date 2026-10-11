package edu.neu.csye7374;

public class EagerAppleStockFactory implements StockFactory {
    private static final EagerAppleStockFactory instance = new EagerAppleStockFactory();

    private EagerAppleStockFactory() {}

    public static EagerAppleStockFactory getInstance() {
        return instance;
    }

    @Override
    public Stock createStock(String name, Double price, String description, double volatilityFactor) {
        return new AppleStock(name, price, description, volatilityFactor);
    }
}