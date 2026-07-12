package loopingStatements;
import java.util.Scanner;

public class ReverseNumberUsingFor {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev=0;
        for(;num!=0;num=num/10) {
        	int digit=num%10;
        	rev=rev*10+digit;
        }
        System.out.print("reverse number :"+rev);
        sc.close();
        
	}
}
