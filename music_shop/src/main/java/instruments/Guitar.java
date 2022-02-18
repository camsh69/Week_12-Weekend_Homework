package instruments;

import shop.Cost;

public class Guitar extends Instrument {

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
}
