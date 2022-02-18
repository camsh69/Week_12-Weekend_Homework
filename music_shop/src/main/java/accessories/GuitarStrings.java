package accessories;

import shop.Cost;
import shop.ISell;

public class GuitarStrings implements ISell {

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

    @Override
    public double calculateMarkUp() {
        return this.pricing.calculateMarkUp();
    }
}
