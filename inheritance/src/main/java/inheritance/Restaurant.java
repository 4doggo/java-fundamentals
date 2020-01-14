package inheritance;

import java.util.LinkedList;

public class Restaurant implements Reviewable{

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

    @Override
    public void addReview(Review review) {
//        addReview adds a review to the LL using .add builtin method
//        addReview is going to add pointer (which helps the communication between interface)

        restaurantReviews.add(review);
//        ?????
        review.business = this;

    }

//    Do star rating for restaurant from LL an average & make sure it updates 


    public String toString(){
        return "The restaurant " + restaurantName + " has " + stars + " stars, in the range of " + price + "!" + " Read the reviews: " + restaurantReviews;
    }

}


