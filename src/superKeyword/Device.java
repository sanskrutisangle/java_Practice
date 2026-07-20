package superKeyword;

public class Device {
	String brand;
	double powerConsumption;
	
	Device(){
		
	}
	Device(String brand,double powerConsumption){
		this.brand=brand;
		this.powerConsumption=powerConsumption;
	}
	void display() {
		System.out.println("brand : "+ brand);
		System.out.println("power consumption  : "+powerConsumption);
	}

}
