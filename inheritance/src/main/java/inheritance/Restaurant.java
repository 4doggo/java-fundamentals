package inheritance;

import java.util.LinkedList;

public class Restaurant {

    String restaurantName;
    int stars;
    String price;
    LinkedList<Review> restaurantReviews;

//    restaurant constructor
    public Restaurant (String restaurantName, int stars, String price){

        this.restaurantName = restaurantName;
        this.stars = stars;
        this.price = price;
        this.restaurantReviews = new LinkedList<>();
    }

    public String toString(){
        return "The restaurant " + restaurantName + " has " + stars + " stars, in the range of " + price + "!" + " Read the reviews: " + restaurantReviews;
    }

}


