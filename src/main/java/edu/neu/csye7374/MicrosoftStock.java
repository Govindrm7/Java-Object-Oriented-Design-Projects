package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class MicrosoftStock extends Stock {
    private double metric;

    public MicrosoftStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        this.price += bidValue;
        this.metric = this.price * 0.85;
    }

    @Override
    public String getMetric() {
        return String.valueOf(this.metric);
    }
}


