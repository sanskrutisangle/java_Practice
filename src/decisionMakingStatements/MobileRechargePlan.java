package decisionMakingStatements;

import java.util.Scanner;

public class MobileRechargePlan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a Prepaid customer? (Y/N): ");
        char type = sc.next().charAt(0);

        if (type == 'Y' || type == 'y') {

            System.out.print("Enter Recharge Amount: ");
            double amount = sc.nextDouble();

            if (amount >= 299) {
                System.out.println("Plan Activated: Unlimited Calls + 2GB/day Data");
            } else {
                System.out.println("Plan Activated: Unlimited Calls + 1GB/day Data");
            }

        } else {

            System.out.println("Postpaid Monthly Bill Plan Activated.");

        }

        sc.close();
    }
}