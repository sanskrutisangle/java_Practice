package decisionMakingStatements;
import java.util.Scanner;

public class PositiveNegativeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("entr the number");
		int num =sc.nextInt();
		if(num>=0) {
			
			System.out.println("number is positive");
		}else {
			System.out.println("number is negetive");
		}
		sc.close();
	}

}
