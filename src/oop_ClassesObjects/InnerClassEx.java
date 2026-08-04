package oop_ClassesObjects;
class Car {
	private String brand ="TATA";
	class Engine{
		void start() {
            System.out.println("Engine started for " + brand);
        }
	}
}
public class InnerClassEx {
	public static void main(String[] args) {

        Car car = new Car();
        Car.Engine obj =car.new Engine();
        obj.start();
	}
}
