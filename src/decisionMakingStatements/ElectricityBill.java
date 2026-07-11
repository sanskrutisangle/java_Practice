package decisionMakingStatements;
import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();

        double bill = 0;
        if(units<0) {
        	System.out.println("Invalid units.");
          	
        }else if(units<=100) {
        	bill=units*1.50;
        	
        }else if(units<=200) {
        	bill=units*2.50;
        	
        }else if(units<=300) {
        	bill=units*4;
        	
        }else {
        	bill=units*6;
        	
        }
        if(units>=0) {
        	System.out.println("Units Consumed : " + units);
            System.out.println("Electricity Bill : ₹" + bill);
        }
        sc.close();

	}
}
