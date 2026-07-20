package superKeyword;

public class SmartTV extends Device {
	int screenSize;
	String resolution;
	
	SmartTV(String brand,double powerConsumption,int screenSize,String resolution ){
		super();
		this.brand=brand;
		this.powerConsumption=powerConsumption;
		this.screenSize =screenSize ;
		this.resolution=resolution ;
	}
	void display() {
		super.display();
		System.out.println("screenSize "+screenSize);
		System.out.println("resolution : "+resolution);
	}
	void comparePower() {
		double powerConsumption = 200;
		System.out.println("child class power Consumption : "+powerConsumption);
		System.out.println("parent class power Consumption : "+super.powerConsumption);
		
	}

}
