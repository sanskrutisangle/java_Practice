package inherits;

//Parent Class
class Restaurant {
 String restaurantName;
 String location;
 double rating;

 // Constructor
 Restaurant(String restaurantName, String location, double rating) {
     this.restaurantName = restaurantName;
     this.location = location;
     this.rating = rating;
 }

 // Method to display restaurant details
 void displayDetails() {
     System.out.println("Restaurant Name : " + restaurantName);
     System.out.println("Location        : " + location);
     System.out.println("Rating          : " + rating);
 }
}

//Child Class
class DeliveryRestaurant extends Restaurant {
 double deliveryCharge;
 int estimatedTime;

 // Constructor
 DeliveryRestaurant(String restaurantName, String location, double rating,
                    double deliveryCharge, int estimatedTime) {
     super(restaurantName, location, rating);
     this.deliveryCharge = deliveryCharge;
     this.estimatedTime = estimatedTime;
 }

 // Method to display delivery information
 void showDeliveryInfo() {
     System.out.println("Delivery Charge : ₹" + deliveryCharge);
     System.out.println("Estimated Time  : " + estimatedTime + " minutes");
 }
}

//Main Class
public class FoodDeliverySystem {
 public static void main(String[] args) {

     DeliveryRestaurant restaurant = new DeliveryRestaurant(
             "Spice Garden",
             "Pune",
             4.7,
             40,
             30
     );

     restaurant.displayDetails();
     restaurant.showDeliveryInfo();
 }
}