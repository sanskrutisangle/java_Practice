package decisionMakingStatements;

import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks Percentage: ");
        double marks = sc.nextDouble();

        if(marks>=75) {
        	System.out.print("Enter Family Income: ");
            double income = sc.nextDouble();
        	if(income<=300000) {
        		 System.out.println("Congratulations! You are eligible for the scholarship.");
        	}else {
        		System.out.println("Not eligible. Family income is too high.");
        	}
        	
        }else {
        	 System.out.println("Not eligible. Marks are below 75%.");
        }
        sc.close();
    }

}
