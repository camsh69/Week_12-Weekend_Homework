package instruments;

import shop.Cost;
import shop.ISell;

import java.nio.channels.IllegalSelectorException;

public class Saxophone extends Instrument implements IPlay, ISell {

    private String saxophoneType;
    private String key;

    public Saxophone(String material, String colour, InstrumentType type, String manufacturer, String model, Cost pricing, String saxophoneType, String key) {
        super(material, colour, type, manufacturer, model, pricing);
        this.saxophoneType = saxophoneType;
        this.key = key;
    }

    public String getSaxophoneType() {
        return saxophoneType;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String play() {
        return "blare!";
    }

    @Override
    public double calculateMarkUp() {
        return super.getPricing().calculateMarkUp();
    }
}
