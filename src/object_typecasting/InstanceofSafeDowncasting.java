package object_typecasting;

class vehical{
	public void start() {
		System.out.println("Vehicle starts.");
	}
	
}
class bike extends vehical{
	public void ride() {
		System.out.println("bike is riding.");
	}
	
}
public class InstanceofSafeDowncasting {
	public static void mian(String[] args) {
		vehical v=new bike();//upcasting
		v.start();
		if(v instanceof bike) {
			bike b=(bike)v;//downcasting
			b.ride();
		}else {
			System.out.println("Object is not a Bike.");
		}
		
		
	}

}
