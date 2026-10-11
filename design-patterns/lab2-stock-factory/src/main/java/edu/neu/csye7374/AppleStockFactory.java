package edu.neu.csye7374;

public class AppleStockFactory implements StockFactory {
    @Override
    public Stock createStock(String name, Double price, String description, double volatilityFactor) {
        return new AppleStock(name, price, description, volatilityFactor);
    }
}