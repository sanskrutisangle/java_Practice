package encapsulation;
class Account{
	private int accountNumber;
	private String accountHolder;
	private int balance=400000;
	public void setaccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	public void setaccountHolder(String accountHolder) {
		this.accountHolder=accountHolder;
	}
	
	public void setbalance(int balance) {
		this.balance=balance;
	}
	 public int getaccountNumber() {
	        return accountNumber;
	    }

	    public String getaccountHolder() {
	        return accountHolder;
	    }

	public void deposit(int amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("balance is now : "+balance);
		}else {
			System.out.println("invalid amount");
		}
	}
	void withdraw(int amount) {
		if(amount<=balance) {
			balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
	}
	void displayBalance() {
		 System.out.println("Current Balance: " + balance);
	}
}
public class BankAccount {
	 public static void main(String[] args) {

	        Account account = new Account();

	        account.setaccountNumber(12345);
	        account.setaccountHolder("Sanskruti");

	        account.deposit(10000);
	        account.withdraw(3000);
	        account.displayBalance();
	    }
}
