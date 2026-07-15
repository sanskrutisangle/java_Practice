package methods;
import java.util.*;

public class ReverseNumberRecursion {
	static int reverse(int num) {
		if(num==0) {//base call
			return 0;
		}
		System.out.print(num%10);// Print last digit
		return reverse(num/10);//Recursive call
	}
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        System.out.print("Reversed Number = ");
	        reverse(num);

	        sc.close();
	    }

}
