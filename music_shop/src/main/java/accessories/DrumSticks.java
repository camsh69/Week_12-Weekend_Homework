package accessories;

import shop.Cost;
import shop.ISell;

public class DrumSticks implements ISell {

    private int thickness;
    private Cost pricing;

    public DrumSticks(int thickness, Cost pricing) {
        this.thickness = thickness;
        this.pricing = pricing;
    }

    public int getThickness() {
        return thickness;
    }

    public Cost getPricing() {
        return pricing;
    }

    @Override
    public double calculateMarkUp() {
        return this.pricing.calculateMarkUp();
    }
}
