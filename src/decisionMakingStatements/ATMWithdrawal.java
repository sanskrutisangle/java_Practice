package decisionMakingStatements;
import java.util.Scanner;

public class ATMWithdrawal {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean cardValid = true;
        int correctPin = 1234;
        double balance = 10000;

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();
        
        if(cardValid) {
        	if(correctPin==pin) {
        		if(balance>=amount) {
        			balance=balance-amount;
        			System.out.print("remainig balance : "+balance);
        			
        		}else {
        			System.out.print("Insufficient Balance");
        		}
        		
        	}else {
        		System.out.print("invalid pin");
        	}
                	
        }else {
        	System.out.print("invalid card");
        }
        
    sc.close();    
}
}
