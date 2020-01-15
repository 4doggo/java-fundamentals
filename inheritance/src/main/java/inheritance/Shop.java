package inheritance;

import java.util.LinkedList;

public class Shop {

        String shopName;
        String description;
        String price;
        LinkedList<Review> restaurantReviews;

        //    restaurant constructor
        public Shop (String shopName, String description, String price){

            this.shopName = shopName;
            this.description = description;
            this.price = price;
            this.restaurantReviews = new LinkedList<>();
        }

}
