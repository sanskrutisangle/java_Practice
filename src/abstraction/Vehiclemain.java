package abstraction;

abstract class Vehicle{
	String speed ="200 max";
	Vehicle(String company){
		System.out.println("The company name is "+company);
		
	}
	abstract void start();
	void stop() {
		System.out.println("Vehicle Stopped");
	}
}
class Car extends Vehicle{
	Car(String company){
		super(company);
	}
	@Override
	void start() {
		System.out.println("Car starts using Push Button.");
	}
	
	
}
class Bike extends Vehicle{
	Bike(String company){
		super(company);
	}
	@Override
	void start() {
		System.out.println("Bike starts using Self Start");
	}
}
public class Vehiclemain {
	public static void main(String[] args) {
		Car c=new Car("TATA");
		System.out.println(c.speed+" Speed");
		c.start();
		c.stop();
		Bike b=new Bike("BAJAJ");
		System.out.println(b.speed+" Speed");
		b.start();
		b.stop();
		
	}

}
