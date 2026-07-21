package finalKeyword;
import java .util.Scanner;
public final class BankDatabase extends SecurityManager{
	Scanner sc=new Scanner(System.in);
	String customerName="sanskruti sangale";
	long accountNumber=907856349;
		public void display() {
			System.out.println("name :"+customerName);
			System.out.println("Account Number :"+accountNumber);
			
		}
		public void checkpin() {
			System.out.println("enter the pin :");
			int pin=sc.nextInt();
			 verifyPIN(pin);
		}
		
}
/*class AdminPanel extends BankDatabase{
	
}*/
