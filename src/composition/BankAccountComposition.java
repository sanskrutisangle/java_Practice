package composition;

class AccountDetails {
    long accountNumber;
    String accountType;
    double balance;

    AccountDetails(long accountNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class BankAccount {
    String holderName;
    AccountDetails accountDetails;

    BankAccount(String holderName, long accountNumber,
                String accountType, double balance) {

        this.holderName = holderName;

        // BankAccount creates AccountDetails
        accountDetails = new AccountDetails(
                accountNumber,
                accountType,
                balance
        );
    }

    void deposit(double amount) {
        accountDetails.balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void displayAccount() {
        System.out.println("Account Holder: " + holderName);
        accountDetails.displayDetails();
    }
}

public class BankAccountComposition {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "Sanskruti",
                123456789,
                "Savings",
                10000
        );

        account.displayAccount();

        System.out.println("\nAfter Deposit:");

        account.deposit(5000);

        account.displayAccount();
    }
}