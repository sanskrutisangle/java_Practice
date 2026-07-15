package methods;
import java.util.Scanner;

public class FibonacciRecursion {
	static int Fibonacci(int n) {
		if(n==0) {
		 return 0;	
		}
		if(n==1) {
			return 1;
		}
		
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number : ");
		int n=sc.nextInt();
		System.out.println("Fibonacci : ");
		for(int i=0;i<n;i++) {//Fibonacci series starts from index 0.
			System.out.println(Fibonacci(i));//loop keeps changing i, and each time fibonacci(i) returns the next Fibonacci number.
		}
		sc.close();
	}
	

}
