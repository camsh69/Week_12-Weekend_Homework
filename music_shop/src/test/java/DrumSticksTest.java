import accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;
import shop.Cost;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;
    Cost cost;

    @Before
    public void before() {
        cost = new Cost(10.00, 15.00);
        drumSticks = new DrumSticks(5, cost);
    }

    @Test
    public void hasThickness() {
        assertEquals(5, drumSticks.getThickness(), 0.0);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(10.00, drumSticks.getPricing().getBuyingPrice(), 0.0);
    }

    @Test
    public void canSetBuyingPrice() {
        drumSticks.getPricing().setBuyingPrice(9.00);
        assertEquals(9.00, drumSticks.getPricing().getBuyingPrice(), 0.0);
    }
}
