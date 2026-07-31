package abstraction;
import java.util.Scanner;

abstract class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void display() {

        System.out.println("\n==============================");
        System.out.println("Account Type : " + this.getClass().getSimpleName());
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance : ₹" + balance);
        System.out.println("==============================");
    }

    void deposit(double amount) {

        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    void checkBalance() {

        System.out.println("Current Balance : ₹" + balance);
    }

    abstract void withdrawal(double amount);
}


class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    void withdrawal(double amount) {

        double minimumBalance = 1000;

        if (balance - amount >= minimumBalance) {

            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {

            System.out.println("Cannot withdraw.");
            System.out.println("Minimum balance of ₹1000 must be maintained.");
        }
    }
}


class CurrentAccount extends BankAccount {

    CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    void withdrawal(double amount) {

        double overdraftLimit = 5000;

        if (balance + overdraftLimit >= amount) {

            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {

            System.out.println("Overdraft limit exceeded.");
        }
    }
}


class FixedDepositAccount extends BankAccount {

    FixedDepositAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    void withdrawal(double amount) {

        System.out.println("Withdrawal is not allowed before maturity.");
    }
}


public class MAHABank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number : ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name : ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance : ");
        double balance = sc.nextDouble();

        System.out.print("Enter Deposit Amount : ");
        double depositAmount = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount : ");
        double withdrawAmount = sc.nextDouble();

        BankAccount[] accounts = {

                new SavingsAccount(accountNumber, accountHolderName, balance),
                new CurrentAccount(accountNumber, accountHolderName, balance),
                new FixedDepositAccount(accountNumber, accountHolderName, balance)

        };

        for (BankAccount account : accounts) {

            account.display();

            account.deposit(depositAmount);

            account.withdrawal(withdrawAmount);

            account.checkBalance();
        }

        sc.close();
    }
}
