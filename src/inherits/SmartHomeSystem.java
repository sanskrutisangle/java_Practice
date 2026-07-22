package inherits;

class SmartDevice{
	protected int deviceId;
    protected String brand;
    protected boolean powerStatus;
    public SmartDevice(int deviceId, String brand) {
        this.deviceId = deviceId;
        this.brand = brand;
        this.powerStatus = false;
    }
    public void turnOn() {
        powerStatus = true;
        System.out.println("Device is ON");
    }

    public void turnOff() {
        powerStatus = false;
        System.out.println("Device is OFF");
    }

    public void displayDevice() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Brand     : " + brand);
        System.out.println("Power     : " + (powerStatus ? "ON" : "OFF"));
    }
    
}
class SmartLight extends SmartDevice {

    public SmartLight(int deviceId, String brand) {
        super(deviceId, brand);
    }

    public void changeBrightness(int level) {
        System.out.println("Brightness set to " + level + "%");
    }
}
class SmartFan extends SmartDevice {

    public SmartFan(int deviceId, String brand) {
        super(deviceId, brand);
    }

    public void changeSpeed(int speed) {
        System.out.println("Fan speed set to Level " + speed);
    }
}

class SmartTV extends SmartDevice {

    public SmartTV(int deviceId, String brand) {
        super(deviceId, brand);
    }

    public void changeChannel(int channel) {
        System.out.println("Channel changed to " + channel);
    }
}

public class SmartHomeSystem {
	public static void main(String[] args) {
		SmartLight light = new SmartLight(101, "Philips");
        SmartFan fan = new SmartFan(102, "Havells");
        SmartTV tv = new SmartTV(103, "Samsung");

        System.out.println("----- Smart Light -----");
        light.turnOn();
        light.displayDevice();
        light.changeBrightness(80);

        System.out.println();

        System.out.println("----- Smart Fan -----");
        fan.turnOn();
        fan.displayDevice();
        fan.changeSpeed(4);

        System.out.println();

        System.out.println("----- Smart TV -----");
        tv.turnOn();
        tv.displayDevice();
        tv.changeChannel(55);
	}

}
