
package methods;
import java.util.*;

public class CountDigitsRecursion {
	static int countDigits(int num) {
		if(num<10) {
			return 1;
		}
		return 1+countDigits(num/10);
	}
	public static void main(String[] args) {

	
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("Number of digits = " + countDigits(num));

    sc.close(); 
}

}
