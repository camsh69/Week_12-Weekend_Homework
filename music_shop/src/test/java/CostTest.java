import org.junit.Before;
import org.junit.Test;
import shop.Cost;

import static org.junit.Assert.assertEquals;

public class CostTest {

    Cost cost;

    @Before
    public void before() {
        cost = new Cost(120.00, 150.00);
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(120.00, cost.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(150.00, cost.getSellingPrice(), 0.0);
    }

    @Test
    public void canSetBuyingPrice() {
        cost.setBuyingPrice(120.00);
        assertEquals(120.00, cost.getBuyingPrice(), 0.0);
    }

    @Test
    public void canSetSellingPrice() {
        cost.setSellingPrice(160.00);
        assertEquals(160.00, cost.getSellingPrice(), 0.0);
    }
}
