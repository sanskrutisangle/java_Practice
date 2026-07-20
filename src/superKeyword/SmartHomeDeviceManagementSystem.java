package superKeyword;

import java.util.Scanner;

public class SmartHomeDeviceManagementSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the brand ");
		String brand =sc.nextLine();
		System.out.println("enter the power consumption ");
		double powerConsumption=sc.nextDouble();
		System.out.println("enter the screen size ");
		int screenSize=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the resolution");
		String resolution=sc.nextLine();
		
		SmartTV tv= new SmartTV( brand, powerConsumption, screenSize, resolution );
		System.out.println("============Smart TV Details==============");
		tv.display();
		tv.comparePower();
		sc.close();
		
	}


}
