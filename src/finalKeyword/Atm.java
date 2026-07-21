package finalKeyword;

public class Atm {
	final int DAILY_LIMIT=50000;
	int balance=1000000;
	int amount;
	Atm(int amount){
		this.amount=amount;
	}
	
	public void withdraw(int amount) {
		if(amount<=DAILY_LIMIT) {
			balance=balance-amount;
			System.out.println("Amount Withdrawal Successful");	
			System.out.println("Remaining balance :"+balance);
			}else {
				System.out.println("Daily Limit Exceeded");	
		}
	}

}
