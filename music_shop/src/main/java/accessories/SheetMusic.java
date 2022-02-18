package accessories;

import shop.Cost;
import shop.ISell;

public class SheetMusic implements ISell {

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

    @Override
    public double calculateMarkUp() {
        return this.pricing.calculateMarkUp();
    }
}
