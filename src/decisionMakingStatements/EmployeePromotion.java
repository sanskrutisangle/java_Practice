package decisionMakingStatements;

import java.util.Scanner;

public class EmployeePromotion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Years of Experience: ");
        int experience = sc.nextInt();

        if (experience >= 5) {

            System.out.print("Enter Performance Rating (1 to 5): ");
            int rating = sc.nextInt();

            if (rating >= 4) {
                System.out.println("Congratulations! You are eligible for promotion.");
            } else {
                System.out.println("Not eligible. Performance rating is too low.");
            }

        } else {
            System.out.println("Not eligible. Minimum 5 years of experience is required.");
        }

        sc.close();
    }
}