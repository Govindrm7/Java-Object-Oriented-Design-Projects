package edu.neu.csye7374;

public class EagerAmexStockFactory implements StockFactory {
    private static final EagerAmexStockFactory instance = new EagerAmexStockFactory();

    private EagerAmexStockFactory() {
    }

    public static EagerAmexStockFactory getInstance() {
        return instance;
    }

    @Override
    public Stock createStock(String name, Double price, String description, double volatilityFactor) {
        return new AmexStock(name, price, description);
    }
}