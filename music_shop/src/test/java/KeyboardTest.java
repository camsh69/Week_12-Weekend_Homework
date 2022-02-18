import instruments.InstrumentType;
import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;
import shop.Cost;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KeyboardTest {

    Keyboard keyboard;
    Cost cost;

    @Before
    public void before() {
        cost = new Cost(400, 500);
        keyboard = new Keyboard("Plastic", "black", InstrumentType.KEYBOARD, "Synapse Audio", "Dune 3", cost, true, "Midi");
    }

    @Test
    public void hasSequencer__True() {
        assertTrue(keyboard.hasSequencer());
    }

    @Test
    public void hasOutPut() {
        assertEquals("Midi", keyboard.getOutput());
    }
}
