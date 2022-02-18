import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;
import shop.Cost;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;
    Cost cost;

    @Before
    public void before() {
        cost = new Cost(250.00, 299.99);
        saxophone = new Saxophone("Brass", "Brass", InstrumentType.BRASS, "Eastar", "123A", cost, "Alto", "Eb");
    }

    @Test
    public void hasSaxoPhoneType() {
        assertEquals("Alto", saxophone.getSaxophoneType());
    }

    @Test
    public void hasKey() {
        assertEquals("Eb", saxophone.getKey());
    }

    @Test
    public void canPlay() {
        assertEquals("blare!", saxophone.play());
    }
}
