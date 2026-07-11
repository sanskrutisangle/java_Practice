package decisionMakingStatements;

import java.util.Scanner;

public class DrivingLicenseEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        if(age>=18) {
        	System.out.print("Are your documents verified? (true/false): ");
            boolean documentsVerified = sc.nextBoolean();
            if(documentsVerified) {
            	System.out.println("Congratulations! You are eligible for a driving license.");
            } else {
                System.out.println("Not eligible. Documents are not verified.");
            }

        } else {
            System.out.println("Not eligible. Age must be at least 18 years.");
        }
        sc.close();
    }
}
