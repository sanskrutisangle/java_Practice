package exceptionHandling;


class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);	
		
	}
	/* 
	 * public InsufficientBalanceException() {
        super("You have Insufficient Balance"); 
    }

	 */
}

public class BankAccount {
	static void withdraw(int amount)throws InsufficientBalanceException {
		int balance=10000;
		
		if(amount<0) {
			System.out.println("amount should be positive number ");
		}
		if(balance<amount) {
			throw new InsufficientBalanceException("you have Insufficient Balance");
		}
		
		balance=balance-amount;
		System.out.println("money withdraw succesfully & you remaining balance = "+ balance);
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		  
		System.out.println("enter the amount :");
		int amount=sc.nextInt();
		 		try {
		 			withdraw(amount);
		 		}catch(InsufficientBalanceException e) {
		 			System.out.println("error found :"+ e.getMessage());
		 		}
		 		
		 		sc.close();
	}
	

}
