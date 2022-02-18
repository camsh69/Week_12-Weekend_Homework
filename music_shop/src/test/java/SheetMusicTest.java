import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;
import shop.Cost;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;
    Cost cost;

    @Before
    public void before() {
        cost = new Cost(2.00, 3.00);
        sheetMusic = new SheetMusic("Ace of Spades", cost);
    }

    @Test
    public void hasComposition(){
        assertEquals("Ace of Spades", sheetMusic.getComposition());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(2.00, sheetMusic.getPricing().getBuyingPrice(), 0.0);
    }

    @Test
    public void canSetBuyingPrice() {
        sheetMusic.getPricing().setBuyingPrice(9.00);
        assertEquals(9.00, sheetMusic.getPricing().getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(3.00, sheetMusic.getPricing().getSellingPrice(), 0.0);
    }

    @Test
    public void canSetSellingPrice() {
        sheetMusic.getPricing().setSellingPrice(12.00);
        assertEquals(12.00, sheetMusic.getPricing().getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(1.00, sheetMusic.calculateMarkUp(), 0.0);
    }
}

