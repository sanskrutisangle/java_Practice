package methods;
import java.util.Scanner;

public class Factorial {
	static int factorial(int num) {
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial = " + result);

        sc.close();
	}

}
