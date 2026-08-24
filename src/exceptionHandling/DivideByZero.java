package exceptionHandling;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st number : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the 2nd number : ");
		int num2= sc.nextInt();
		
		try {
			int result=num1/num2;
			System.out.println("result : "+result);
		}catch(ArithmeticException e) {
			System.out.println("can not divide by zero");
		}
		sc.close();
	}

}
