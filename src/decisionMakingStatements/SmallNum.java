package decisionMakingStatements;

import java.util.Scanner;

public class SmallNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number : ");
		int num1 =sc.nextInt();
		System.out.println("enter second number :");
		int num2 =sc.nextInt();
		
		if(num1<num2) {
			System.out.print(num1+" is small number");
		}else {
			System.out.print(num2+" is small number");
		}
		sc.close();

   }
}
