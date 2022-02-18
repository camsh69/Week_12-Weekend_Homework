package accessories;

import shop.Cost;

public class GuitarStrings {

    private int gauge;
    private Cost pricing;

    public GuitarStrings(int gauge, Cost pricing) {
        this.gauge = gauge;
        this.pricing = pricing;
    }

    public int getGauge() {
        return gauge;
    }

    public Cost getPricing() {
        return pricing;
    }
}
