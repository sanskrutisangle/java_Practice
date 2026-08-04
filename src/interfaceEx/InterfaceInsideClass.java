package interfaceEx;
class Vehicle {

    interface Engine {
        void start();
    }
}
class Car implements Vehicle.Engine {

    @Override
    public void start() {
        System.out.println("Engine Started");
    }
}

public class InterfaceInsideClass {
	public static void main(String[] args) {
		 Car c = new Car();
	        c.start();
	}

}
