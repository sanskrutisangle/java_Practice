package decisionMakingStatements;
import java.util.Scanner;

public class DivisibleByNum {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("enter number : ");
		int number=sc.nextInt();
		System.out.print("enter divisor : ");
		int divisor=sc.nextInt();
		
		if(number%divisor==0) {
			System.out.print(number+" is divisible by "+divisor);
		}else{
			System.out.print(number+" is not divisible by "+divisor);
		}
		sc.close();
	}

}
