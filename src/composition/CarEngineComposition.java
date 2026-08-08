package composition;

class Engine {
    int engineNumber;
    String type;

    Engine(int engineNumber, String type) {
        this.engineNumber = engineNumber;
        this.type = type;
    }

    void start() {
        System.out.println("Engine Started");
    }

    void displayEngine() {
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("Engine Type: " + type);
    }
}

class Car {
    String brand;
    Engine engine;

    Car(String brand) {
        this.brand = brand;

        // Car creates its own Engine
        engine = new Engine(1001, "Petrol");
    }

    void startCar() {
        System.out.println("Car Brand: " + brand);
        engine.start();
    }

    void displayCar() {
        System.out.println("Car Brand: " + brand);
        engine.displayEngine();
    }
}

public class CarEngineComposition {
    public static void main(String[] args) {

        Car car = new Car("Toyota");

        car.displayCar();
        car.startCar();
    }
}