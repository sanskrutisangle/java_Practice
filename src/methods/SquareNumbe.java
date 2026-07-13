package methods;

import java.util.Scanner;

public class SquareNumbe {
	
	public static int calculate(int num) {
		
		return num * num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the number");
		int num = sc.nextInt();
		
		int result=calculate(num);
		
		System.out.print("squre :"+result);
		
		sc.close();
		
		
	}

}
