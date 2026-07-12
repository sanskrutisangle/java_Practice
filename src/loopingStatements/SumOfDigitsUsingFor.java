package loopingStatements;

import java.util.Scanner;

public class SumOfDigitsUsingFor {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum=0;
        for(;num!=0;num=num/10) {
        	int digit=num%10;
        	sum=sum+digit;
        }
        System.out.println("sum of digit : "+sum);
        sc.close();
	}


}
