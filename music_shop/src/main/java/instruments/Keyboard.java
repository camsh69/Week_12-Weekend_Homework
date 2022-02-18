package instruments;

import shop.Cost;

public class Keyboard extends Instrument {

    private boolean sequencer;
    private String output;

    public Keyboard(String material, String colour, InstrumentType type, String manufacturer, String model, Cost pricing, boolean sequencer, String output) {
        super(material, colour, type, manufacturer, model, pricing);
        this.sequencer = sequencer;
        this.output = output;
    }

    public boolean hasSequencer() {
        return sequencer;
    }

    public String getOutput() {
        return output;
    }
}

