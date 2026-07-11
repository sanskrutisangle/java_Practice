package decisionMakingStatements;

import java.util.Scanner;

public class ATMMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance = ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();

                    balance = balance + deposit;

                    System.out.println("Deposit Successful.");
                    System.out.println("Updated Balance = ₹" + balance);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance.");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal Successful.");
                        System.out.println("Remaining Balance = ₹" + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank You for using the ATM.");
                    sc.close();//closes the Scanner
                    return; // immediately exits the main() method.

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}