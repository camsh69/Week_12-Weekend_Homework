import accessories.GuitarStrings;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shop.Cost;
import shop.Shop;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    GuitarStrings guitarStrings;
    Cost guitarCost;
    Cost guitarStringsCost;

    @Before
    public void before() {
        shop = new Shop();
        guitarCost = new Cost(250.00, 300.00);
        guitar = new Guitar("Alder", "Black", InstrumentType.STRING, "Fender", "Telecaster", guitarCost, 6, "Single coil");
        guitarStringsCost = new Cost(5.00, 6.00);
        guitarStrings = new GuitarStrings(10, guitarStringsCost);
    }

    @Test
    public void checkStockStartsEmpty() {
        assertTrue(shop.getStock().isEmpty());
    }

    @Test
    public void canAddItemsToStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitarStrings);
        assertEquals(2, shop.getStock().size());
        assertTrue(shop.getStock().contains(guitar));
        assertTrue(shop.getStock().contains(guitarStrings));
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitarStrings);
        assertEquals(2, shop.getStock().size());
        shop.removeItemFromStock(guitarStrings);
        assertEquals(1, shop.getStock().size());
        assertFalse(shop.getStock().contains(guitarStrings));
    }
}
