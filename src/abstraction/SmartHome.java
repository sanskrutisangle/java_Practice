package abstraction;
abstract class Device{
	abstract void turnOn();
	void turnOff() {
		System.out.println("trun off.......");
	}
	static void helpLine() {
		System.out.println("help line number -09089675");
	}
	final void warranty(){
		System.out.println("2 years warranty ");
	}
}
class Fan extends Device{
	@Override
	void turnOn() {
		System.out.println("turn on fan");
	}
}
class AC extends Device{
	@Override
	void turnOn() {
		System.out.println("turn on AC");
	}
}
class Light extends Device{
	@Override
	void turnOn() {
		System.out.println("turn on light");
	}
}
public class SmartHome {
	public static void main(String[] args) {
		Device[] d= {
				new Fan(),
				new AC(),
				new Light()
		};
		for(Device n:d) {
			n.turnOn();
			n.turnOff();
			n.warranty();
			System.out.println("============================");
			}
		Device.helpLine();
	}

}
