package accessories;

import shop.Cost;

public class SheetMusic {

    private String composition;
    private Cost pricing;

    public SheetMusic(String composition, Cost pricing) {
        this.composition = composition;
        this.pricing = pricing;
    }

    public String getComposition() {
        return composition;
    }

    public Cost getPricing() {
        return pricing;
    }
}
