package interfaceEx;
interface BankAccount{
	int balance=90000;
	void deposit(int amount);

	void withdraw(int amount);
}
class SavingsAccount implements BankAccount{
	@Override
	public void deposit(int amount) {
		int totalAmount =balance+amount;
		System.out.println("amount deposite to Savings Account");
		System.out.println("Total balance : "+totalAmount);
	}
	@Override
	public void withdraw(int amount) {
		int remainAmount=balance-amount;
		System.out.println("amount withdraw from  Savings Account");
		System.out.println("Remaining balance : "+remainAmount);
	}
}
class CurrentAccount implements BankAccount{
	@Override
	public void deposit(int amount) {
		int totalAmount =balance+amount;
		System.out.println("amount deposite to Current Account");
		System.out.println("Total balance : "+totalAmount);
	}
	@Override
	public void withdraw(int amount) {
		int remainAmount=balance-amount;
		System.out.println("amount withdraw from  Current Account");
		System.out.println("Remaining balance : "+remainAmount);
	}
}
class SalaryAccount implements BankAccount{
	@Override
	public void deposit(int amount) {
		int totalAmount =balance+amount;
		System.out.println("amount deposite to Salary Account");
		System.out.println("Total balance : "+totalAmount);
	}
	@Override
	public void withdraw(int amount) {
		int remainAmount=balance-amount;
		System.out.println("amount withdraw from  Salary Account");
		System.out.println("Remaining balance : "+remainAmount);
	}
}
public class DigitalBankingSystem {
public static void main(String[] args) {
	BankAccount account;//dynamic method dispatch.
	
	account = new SavingsAccount();
	account.deposit(9000);
	account.withdraw(500);

	account = new CurrentAccount();
	account.deposit(457);
	account.withdraw(3400);

	account = new SalaryAccount();
	account.deposit(1000);
	account.withdraw(2000);
	}


}
