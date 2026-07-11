package decisionMakingStatements;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CURRENCY CONVERTER =====");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        switch (choice) {

            case 1:
                System.out.println("USD = " + (amount / 86));
                break;

            case 2:
                System.out.println("INR = " + (amount * 86));
                break;

            case 3:
                System.out.println("EUR = " + (amount / 100));
                break;

            case 4:
                System.out.println("INR = " + (amount * 100));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}