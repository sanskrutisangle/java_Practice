package decisionMakingStatements;
import java.util.Scanner;

public class ifEx {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter you age  :");
		int age=sc.nextInt();//Condition must return a boolean value
		if(age>=18) {
			System.out.println("you are eligible");			
		}
		sc.close();
		
		
	}

}
