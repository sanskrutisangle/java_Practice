package interfaceEx;
interface Trackable {

    void trackLocation();

}
abstract class DeliveryAgent {

    int id;
    String name;
    String city;

    DeliveryAgent(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    void login() {
        System.out.println(name + " logged in.");
    }

    void logout() {
        System.out.println(name + " logged out.");
    }

    abstract void deliverOrder();
}
class BikeRider extends DeliveryAgent implements Trackable {

    BikeRider(int id, String name, String city) {
        super(id, name, city);
    }

    @Override
    void deliverOrder() {
        System.out.println(name + " delivers the order using a Bike.");
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking Bike Rider location...");
    }
}
class TruckDriver extends DeliveryAgent implements Trackable {

    TruckDriver(int id, String name, String city) {
        super(id, name, city);
    }

    @Override
    void deliverOrder() {
        System.out.println(name + " delivers the order using a Truck.");
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking Truck Driver location...");
    }
}
class Drone extends DeliveryAgent implements Trackable {

    Drone(int id, String name, String city) {
        super(id, name, city);
    }

    @Override
    void deliverOrder() {
        System.out.println("Drone delivers the order automatically.");
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking Drone location...");
    }
}
public class ECommerceDeliverySystem {
	
	    public static void main(String[] args) {

	        DeliveryAgent[] agents = {
	                new BikeRider(101, "Rahul", "Pune"),
	                new TruckDriver(102, "Amit", "Mumbai"),
	                new Drone(103, "Drone-X", "Nashik")
	        };

	        System.out.println("===== Delivery Agents =====");

	        for (DeliveryAgent agent : agents) {

	            agent.login();
	            agent.deliverOrder();
	            agent.logout();

	            System.out.println();
	        }

	        System.out.println("===== Tracking =====");

	        Trackable[] tracking = {
	                new BikeRider(101, "Rahul", "Pune"),
	                new TruckDriver(102, "Amit", "Mumbai"),
	                new Drone(103, "Drone-X", "Nashik")
	        };

	        for (Trackable t : tracking) {

	            t.trackLocation();

	        }

	    }
	}
