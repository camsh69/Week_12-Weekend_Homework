package instruments;

import shop.Cost;

public class Guitar extends Instrument {
    public Guitar(String material, String colour, InstrumentType type, String manufacturer, String model, Cost pricing) {
        super(material, colour, type, manufacturer, model, pricing);
    }
}
