package inheritance;

import oracle.jrockit.jfr.StringConstantPool;

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

//    a way of using interface because interface only takes 1 args 
    public void createReview(String body, String author, int rating, Reviewable business) {
        Review newReview = new Review(body, author, rating, business);

//        calls method
       addReview(newReview);
       averageRatingCalculation();
    }

    //    Do star rating for restaurant from LL an average & make sure it updates

    public void averageRatingCalculation(){
        int counterToAddStars = 0;

        for(Review i : this.restaurantReviews){
            counterToAddStars += i.rating;
        }

        this.stars = counterToAddStars/restaurantReviews.size();
    }


    @Override
    public void addReview(Review review) {
//        addReview adds a review to the LL using .add builtin method
//        addReview is going to add pointer (which helps the communication between interface)

// adding review to LL
        restaurantReviews.add(review);

        review.business = this;


    }



    public String toString(){
        return "The restaurant " + restaurantName + " has " + stars + " stars, in the range of " + price + "!" + " Read the reviews: " + restaurantReviews;
    }

}


