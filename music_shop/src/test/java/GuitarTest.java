import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shop.Cost;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Cost cost;

    @Before
    public void before() {
        cost = new Cost(250.00, 300.00);
        guitar = new Guitar("Alder", "Black", InstrumentType.STRING, "Fender", "Telecaster", cost);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Alder", guitar.getMaterial());
    }
}
