package accessories;

import shop.Cost;

public class DrumSticks {

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
}
