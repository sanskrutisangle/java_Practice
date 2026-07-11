package decisionMakingStatements;
import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();

        double tax = 0;
        if(income<0) {
        	System.out.println("Invalid income.");
        }else if(income <=250000) {
        	tax = 0;
        
        }else if(income<=500000) {
        	tax= income * 0.5;
               	
        } else {
            tax = income * 0.30;
        }
        
        if(income>=0) {
        	System.out.println("Income : ₹"+income);
        	System.out.println("Tax    : ₹" + tax);
        }
        sc.close();
	}

}
