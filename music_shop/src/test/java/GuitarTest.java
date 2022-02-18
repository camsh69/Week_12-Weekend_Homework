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
        guitar = new Guitar("Alder", "Black", InstrumentType.STRING, "Fender", "Telecaster", cost, 6, "Single coil");
    }

    @Test
    public void hasMaterial() {
        assertEquals("Alder", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Fender", guitar.getManufacturer());
    }

    @Test
    public void hasModel() {
        assertEquals("Telecaster", guitar.getModel());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(250.00, guitar.getPricing().getBuyingPrice(), 0.0);
    }

    @Test
    public void canSetBuyingPrice() {
        guitar.getPricing().setBuyingPrice(200.00);
        assertEquals(200.00, guitar.getPricing().getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(300.00, guitar.getPricing().getSellingPrice(), 0.0);
    }

    @Test
    public void canSetSellingPrice() {
        guitar.getPricing().setSellingPrice(250.00);
        assertEquals(250.00, guitar.getPricing().getSellingPrice(), 0.0);
    }

    @Test
    public void hasNoOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void hasPickupType() {
        assertEquals("Single coil", guitar.getPickupType());
    }

    @Test
    public void canPlay() {
        assertEquals("Twang!", guitar.play());
    }
}
