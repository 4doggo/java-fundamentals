package inheritance;

public class Review {

    String body;
    String author;
    int rating;

//    review constructor
    public Review (String body, String author, int rating){

        this.body = body;
        this.author = author;
        this.rating = rating;
    }

    public String toString(){

        return "Summary: " + body + " Author: " + author + " Rating by this user: " + rating + " / 5";
    }

}
