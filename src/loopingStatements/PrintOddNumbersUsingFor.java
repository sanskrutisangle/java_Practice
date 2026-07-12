package loopingStatements;

import java.util.Scanner;

public class PrintOddNumbersUsingFor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i+=2) {
        	System.out.println(i);
        	count ++;
        }
        System.out.print("odd number from 1 to "+n+" is "+count);
		sc.close();
	}

}
