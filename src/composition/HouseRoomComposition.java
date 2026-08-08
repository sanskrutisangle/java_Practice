package composition;

class Room{
	String roomName ;
	int roomNumber;
	Room(String roomName, int roomNumber){
		this.roomName=roomName;
		this.roomNumber=roomNumber;
	}
	 void displayRoom() {
	        System.out.println("Room Name: " + roomName);
	        System.out.println("Room Number: " + roomNumber);
	    }
}
class House {
	String houseName;
	Room room;
	House(String houseName){
		this.houseName=houseName;
		 room=new Room("Living Room", 101);
		}
	void displayHouse() {
		 System.out.println("House Name: " + houseName);
		room.displayRoom();
	}
}
public class HouseRoomComposition {
	 public static void main(String[] args) {
		 House house = new House("My House");
		 house.displayHouse();
	 }

}
