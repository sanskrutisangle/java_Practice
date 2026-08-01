package multipleInheritanc;
interface Drivable{
	void startDrive();
	void stopDrive();
}
interface Chargeable{
	void startCharging();
	void stopCharging();
}
interface Navigable{
	void setDestination(String location);
	void showCurrentRoute();
}
class ElectricCar implements Drivable,Chargeable,Navigable{
	String carName;
	int batteryLevel;
	String currentLocation;
	ElectricCar(String carName,int batteryLevel,String currentLocation){
		this.carName=carName;
		this.batteryLevel=batteryLevel;
		this.currentLocation=currentLocation;
	}
	void displayCarInfo() {
		System.out.println("Car Name : "+carName);
		System.out.println("battery Level : "+batteryLevel);
		System.out.println("current Location : "+currentLocation);
	}
	@Override
	public void startDrive() {
		System.out.println("start drive");
	}
	@Override
	public void stopDrive() {
		System.out.println("stop drive");
	}
	@Override
	public void startCharging() {
		System.out.println("start charging ");
	}
	@Override
	public void stopCharging() {
		System.out.println("stop charging ");
	}
	@Override
	public void setDestination(String location) {
		System.out.println("Destination Set : "+location);
	}
	@Override
	public void showCurrentRoute() {
		System.out.println("Showing Best Route...");
	}
}
public class SmartElectricVehicle {
	public static void main(String[] args) {
		ElectricCar obj =new ElectricCar("Tata Nexon EV",89,"pune");
		obj.displayCarInfo();
		obj.startDrive();
		obj.stopDrive();
		obj.startCharging();
		obj.stopCharging() ;
		obj.setDestination("nashik");
		obj.showCurrentRoute();
	}

}
