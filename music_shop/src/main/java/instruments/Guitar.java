package instruments;

import shop.Cost;
import shop.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int noOfStrings;
    private String pickupType;

    public Guitar(String material, String colour, InstrumentType type, String manufacturer, String model, Cost pricing, int noOfStrings, String pickupType) {
        super(material, colour, type, manufacturer, model, pricing);
        this.noOfStrings = noOfStrings;
        this.pickupType = pickupType;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String getPickupType() {
        return pickupType;
    }

    @Override
    public String play() {
        return "Twang!";
    }

    @Override
    public double calculateMarkUp() {
        return super.getPricing().calculateMarkUp();
    }
}
