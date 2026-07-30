package interfaceEx;
interface SmartDevice{
	String BRAND="bajaj";//default public static final
	void turnOn();//default abstract public 
	void turnOff();
}
class SmartLight implements SmartDevice{
	@Override
	public void turnOn() {
		System.out.println("turn on the light........");
	}
	@Override
	public void turnOff() {
		System.out.println("turn off the light........");
	}
	
}
class SmartFan implements SmartDevice{
	@Override
	public void turnOn() {
		System.out.println("turn on the fan........");
	}
	@Override
	public void turnOff() {
		System.out.println("turn off the fan........");
	}
	
}
public class SmartHomeDevices {
	public static void main(String[] args) {
		System.out.println(SmartDevice.BRAND);
		SmartLight obj1=new  SmartLight();
		obj1.turnOn();
		obj1.turnOff();
		SmartFan obj2 = new SmartFan();
		obj2.turnOn();
		obj2.turnOff();
	}

}
