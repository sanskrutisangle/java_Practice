package inherits;

//Parent Class
class Vehicle {

 String vehicleNumber;
 String brand;
 double rentPerDay;

 Vehicle(String vehicleNumber, String brand, double rentPerDay) {
     this.vehicleNumber = vehicleNumber;
     this.brand = brand;
     this.rentPerDay = rentPerDay;
 }

 void displayVehicle() {
     System.out.println("Vehicle Number : " + vehicleNumber);
     System.out.println("Brand          : " + brand);
     System.out.println("Rent Per Day   : ₹" + rentPerDay);
 }
}

//Child Class
class ElectricCar extends Vehicle {

 int batteryCapacity;
 int chargingTime;

 ElectricCar(String vehicleNumber, String brand, double rentPerDay,
             int batteryCapacity, int chargingTime) {

     super(vehicleNumber, brand, rentPerDay);

     this.batteryCapacity = batteryCapacity;
     this.chargingTime = chargingTime;
 }

 void displayElectricCar() {

     super.displayVehicle();

     System.out.println("Battery Capacity : " + batteryCapacity + " kWh");
     System.out.println("Charging Time    : " + chargingTime + " Hours");
 }
}

//Main Class
public class VehicleRentalSystem {

 public static void main(String[] args) {

     ElectricCar car = new ElectricCar(
             "MH15AB1234",
             "Tata Nexon EV",
             2500,
             40,
             6
     );

     car.displayElectricCar();
 }
}