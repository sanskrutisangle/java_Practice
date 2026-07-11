package decisionMakingStatements;
import java.util.Scanner;

public class NestedIfEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter you are:");
		int age =sc.nextInt();
		boolean hasLicense=true;
		
		if(age>=18) {
			if(hasLicense) {
				System.out.println("you can drive car...");
			}
		}
		
		
		sc.close();
		
	}

}
