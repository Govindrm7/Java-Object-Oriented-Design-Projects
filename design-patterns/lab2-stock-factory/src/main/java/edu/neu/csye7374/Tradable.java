package edu.neu.csye7374;

public interface Tradable {
    /**
     * place a bid to buy a stock
     *
     * @param bid
     */
   default void setBid(String bid) {
        System.out.println("Setting bid to " + bid);
    };

    default String getMetric() {
        return "3.0";
    };
}