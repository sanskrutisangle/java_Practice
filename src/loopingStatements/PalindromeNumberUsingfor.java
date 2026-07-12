package loopingStatements;

import java.util.Scanner;

public class PalindromeNumberUsingfor {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev=0;
        int original=num;
        for(;num!=0;num=num/10) {
        	int digit=num%10;
        	rev=rev*10+digit;
        }
        if(original==rev) {
        	System.out.print("Palindrome Number");
        	
        }else {
        	 System.out.println("Not a Palindrome Number");
        }
        sc.close();
	}

}
