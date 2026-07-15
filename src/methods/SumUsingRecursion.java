package methods;
import java.util.*;

public class SumUsingRecursion {
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("enter the value of n: ");
	        int n=sc.nextInt();
	        System.out.println("sum of 1 to "+n +"is"+sum(n));
	        sc.close();
	 }

}
