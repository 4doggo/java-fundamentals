package inheritance;

public class Review {

    String body;
    String author;
    int rating;
    Reviewable business;

//    review constructor
    public Review (String body, String author, int rating, Reviewable business){

        this.body = body;
        this.author = author;
        this.rating = rating;
        this.business = business;
    }

    public String toString(){

        return "Summary: " + body + " Author: " + author + " Rating by this user: " + rating + " / 5";
    }

}
