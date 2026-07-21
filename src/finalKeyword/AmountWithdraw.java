package finalKeyword;
import java.util.Scanner;

public class AmountWithdraw {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=============Welcome===========");
		System.out.print("Enter the amount to with draw :");
		int amount=sc.nextInt();
		
		Atm a=new Atm(amount);
		
		a.withdraw(amount);
		
		sc.close();
	}

}
