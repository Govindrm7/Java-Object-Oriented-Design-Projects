package edu.neu.csye7374;

public class NvidiaStock extends Stock {
    private double metric;

    public NvidiaStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        this.price += bidValue;
        this.metric = this.price * 0.81;
    }

    @Override
    public String getMetric() {
        return String.format("%.2f", this.metric);
    }
}
