import accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;
import shop.Cost;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;
    Cost cost;

    @Before
    public void before() {
        cost = new Cost(5.00, 6.00);
        guitarStrings = new GuitarStrings(10, cost);
    }

    @Test
    public void hasGauge() {
        assertEquals(10, guitarStrings.getGauge());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(5.00, guitarStrings.getPricing().getBuyingPrice(), 0.0);
    }

    @Test
    public void canSetBuyingPrice() {
        guitarStrings.getPricing().setBuyingPrice(9.00);
        assertEquals(9.00, guitarStrings.getPricing().getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(6.00, guitarStrings.getPricing().getSellingPrice(), 0.0);
    }

    @Test
    public void canSetSellingPrice() {
        guitarStrings.getPricing().setSellingPrice(12.00);
        assertEquals(12.00, guitarStrings.getPricing().getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMArkUp() {
        assertEquals(1.00, guitarStrings.calculateMarkUp(), 0.0);
    }
}

