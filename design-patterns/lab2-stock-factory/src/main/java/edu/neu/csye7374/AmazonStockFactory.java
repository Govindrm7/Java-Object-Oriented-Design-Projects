package edu.neu.csye7374;

public class AmazonStockFactory implements StockFactory {
    @Override
    public Stock createStock(String name, Double price, String description, double volatilityFactor) {
        return new AmazonStock(name, price, description, volatilityFactor);
    }
}
