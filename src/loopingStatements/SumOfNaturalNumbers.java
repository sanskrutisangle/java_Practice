package loopingStatements;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i =1;i<=n;i++) {
        	sum+=i;
        }
        System.out.print("the sum of natural number :"+sum);
        sc.close();
	}

}
