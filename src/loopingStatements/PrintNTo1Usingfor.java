package loopingStatements;

import java.util.Scanner;

public class PrintNTo1Usingfor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of N :");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
		sc.close();
	}

}
