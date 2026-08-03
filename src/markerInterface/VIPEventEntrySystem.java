package markerInterface;
interface VIPAccess {

}
abstract class Guest {

    int guestId;
    String guestName;

    Guest(int guestId, String guestName) {
        this.guestId = guestId;
        this.guestName = guestName;
    }

    abstract void showDetails();
}

//Celebrity implements Marker Interface
class Celebrity extends Guest implements VIPAccess {

 Celebrity(int guestId, String guestName) {
     super(guestId, guestName);
 }

 @Override
 void showDetails() {
     System.out.println("Celebrity : " + guestName);
 }
}
class Sponsor extends Guest implements VIPAccess {

    Sponsor(int guestId, String guestName) {
        super(guestId, guestName);
    }

    @Override
    void showDetails() {
        System.out.println("Sponsor : " + guestName);
    }
}
//Visitor does NOT implement Marker Interface
class Visitor extends Guest {

 Visitor(int guestId, String guestName) {
     super(guestId, guestName);
 }

 @Override
 void showDetails() {
     System.out.println("Visitor : " + guestName);
 }
}
class EventSecurity{
	public static void checkEntry(Guest guest) {

        guest.showDetails();

        if (guest instanceof VIPAccess) {
            System.out.println("Welcome to the VIP Lounge!");
        } else {
            System.out.println("Sorry! You are not authorized to enter.");
        }

        System.out.println("----------------------------");
    }
}
public class VIPEventEntrySystem {
	 public static void main(String[] args) {
		 Guest g1 = new Celebrity(101, "Shah Rukh Khan");
	        Guest g2 = new Sponsor(102, "Tata Group");
	        Guest g3 = new Visitor(103, "Rahul");

	        EventSecurity.checkEntry(g1);
	        EventSecurity.checkEntry(g2);
	        EventSecurity.checkEntry(g3);
		 
	 }

}
