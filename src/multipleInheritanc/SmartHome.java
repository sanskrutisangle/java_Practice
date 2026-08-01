package multipleInheritanc;
interface Light {

    void turnOnLight();

    void turnOffLight();
}

interface Fan {

    void turnOnFan();

    void turnOffFan();
}

class SmartHomeDevice implements Light, Fan {

    @Override
    public void turnOnLight() {
        System.out.println("Light Turned ON");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Light Turned OFF");
    }

    @Override
    public void turnOnFan() {
        System.out.println("Fan Turned ON");
    }

    @Override
    public void turnOffFan() {
        System.out.println("Fan Turned OFF");
    }
}

public class SmartHome {

    public static void main(String[] args) {

        SmartHomeDevice device = new SmartHomeDevice();

        device.turnOnLight();
        device.turnOnFan();
        device.turnOffLight();
        device.turnOffFan();
    }



}
