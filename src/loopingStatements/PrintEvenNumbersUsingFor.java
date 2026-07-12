package loopingStatements;

import java.util.Scanner;

public class PrintEvenNumbersUsingFor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the value of n");
		int n=sc.nextInt();
		/*
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		*/
		for(int i=2;i<=n;i=i+2) {
			System.out.println(i);
		}
		sc.close();
	}

}
