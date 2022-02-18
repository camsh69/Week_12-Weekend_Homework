package instruments;

import shop.Cost;

public abstract class Instrument {

    private String material;
    private String colour;
    private InstrumentType type;
    private String manufacturer;
    private String model;
    private Cost pricing;

    public Instrument(String material, String colour, InstrumentType type, String manufacturer, String model, Cost pricing) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.pricing = pricing;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Cost getPricing() {
        return pricing;
    }
}

