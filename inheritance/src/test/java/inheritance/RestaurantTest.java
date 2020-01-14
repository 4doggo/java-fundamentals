package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    //   instance var
    Restaurant burgerHouse;

    @Before
    public void setUp() {

        burgerHouse = new Restaurant("Burger House", 5, "$$");

    }

    //    testing constructor to see if it instantiates
    @Test
    public void testRestaurant() {

        assertEquals("expecting restaurant name", "Burger House",
                burgerHouse.restaurantName
        );
        assertEquals("expecting restaurant rating", 5, burgerHouse.stars);

    }

    @Test
    public void testString() {

        assertEquals("The restaurant Burger House has 5 stars, in the range of $$! Read the reviews: []", burgerHouse.toString());

    }


}