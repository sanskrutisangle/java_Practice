package decisionMakingStatements;
import java.util.Scanner;

public class CollegeAdmission {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        
        if(age>=17) {
        	System.out.print("Enter Percentage: ");
            double percentage = sc.nextDouble();
            if(percentage>=60) {
            	System.out.println("Congratulations! You are eligible for college admission.");
            } else {
                System.out.println("Not eligible. Percentage is below 60%.");
            }
        	
        }else {
        	System.out.print("Not eligible. Age must be at least 17 years.");
        }
        sc.close();
	}
}
