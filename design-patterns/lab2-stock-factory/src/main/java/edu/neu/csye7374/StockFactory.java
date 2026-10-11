package edu.neu.csye7374;

public interface StockFactory {
    Stock createStock(String name, Double price, String description, double volatilityFactor);
}