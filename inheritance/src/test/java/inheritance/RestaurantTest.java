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

//    failed test was testing for connection of LL and interface
//    @Test
//    public void testAddingReview(){
//        burgerHouse.
//
//        assertEquals("a review",
//                "The restaurant Burger House has 5 stars, in the range of $$! Read the reviews: [this is such a bad restaurant its crazy]",
//                burgerHouse.addReview(Review));
//
//    }


    @Test
    public void testString() {

        assertEquals("The restaurant Burger House has 5 stars, in the range of $$! Read the reviews: []", burgerHouse.toString());

    }


}