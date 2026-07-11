package decisionMakingStatements;

import java.util.Scanner;

public class LoanApproval {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();
        if (salary >= 30000) {

            System.out.print("Enter Credit Score: ");
            int creditScore = sc.nextInt();

            if (creditScore >= 700) {
                System.out.println("Congratulations! Your loan is approved.");
            } else {
                System.out.println("Loan rejected. Credit score is too low.");
            }

        } else {
            System.out.println("Loan rejected. Salary is below ₹30,000.");
        }
        sc.close();
        
    }

}
