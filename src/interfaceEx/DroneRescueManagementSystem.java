package interfaceEx;
interface RescueDrone{
	void startMission();

	void performTask();

	void returnToBase();
}
class  MedicalDrone implements RescueDrone{
	public void startMission() {
		System.out.println("Mission Started...");
	}

	public void performTask() {
		System.out.println("Delivering medicines to injured people...");
	}

	public void returnToBase() {
		System.out.println("Returning to Base...");
	}
}
class CameraDrone implements RescueDrone{
	public void startMission() {
		System.out.println("Mission Started...");
	}

	public void performTask() {
		System.out.println("Capturing live disaster footage...");
	}

	public void returnToBase() {
		System.out.println("Returning to Base...");
	}
}
class SupplyDrone implements RescueDrone{
	public void startMission() {
		System.out.println("Mission Started...");
	}

	public void performTask() {
		System.out.println("Delivering food and water supplies...");
	}

	public void returnToBase() {
		System.out.println("Returning to Base...");
	}
}
public class DroneRescueManagementSystem {
	public static void main(String[] args) {
		RescueDrone[] drones= {
				new MedicalDrone(),
				new CameraDrone(),
				new SupplyDrone()
		};
		for(RescueDrone n:drones) {
			n.startMission();
			n.performTask();
			n.returnToBase();
		}
		
	}
}
