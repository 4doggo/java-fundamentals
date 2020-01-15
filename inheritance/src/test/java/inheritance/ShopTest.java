package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop computerShop;

    @Before
    public void setUp() {

        computerShop = new Shop("Grape", "All the latest computers on sale for cheap!", "$");
    }

    @Test
    public void testShop() {

        assertEquals("expecting shop name", "Grape",
                computerShop.shopName
        );
        assertEquals("All the latest computers on sale for cheap!", computerShop.description);

    }

    @Test
    public void testToString(){

        assertEquals("Shop name: Grape, Description: All the latest computers on sale for cheap! Price range: $",
                "Shop name: " + computerShop.shopName + ", Description: " + computerShop.description + " Price range: " + computerShop.price);

    }
}