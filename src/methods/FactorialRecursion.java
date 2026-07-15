package methods;
import java.util.*;

public class FactorialRecursion {
	static int factorial(int n) {
		if(n==0||n==1) {//base case
			return 1;
		}
		return n*factorial(n-1);//// Recursive case
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number :");
		int n=sc.nextInt();
		System.out.print("factorial : "+factorial(n));
		
		sc.close();
	}

}
