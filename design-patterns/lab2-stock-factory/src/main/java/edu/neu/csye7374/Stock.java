package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public abstract class Stock implements Tradable {
    protected String name;
    protected Double price;
    protected String description;
    protected List<Double> bidHistory;

    public Stock(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.bidHistory = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Stock{name='" + getName() + "', price=" + getPrice() + ", description='" + getDescription() + "'}";
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return Math.round(price * 100.0) / 100.0;
    }

    public String getDescription() {
        return description;
    }
}
