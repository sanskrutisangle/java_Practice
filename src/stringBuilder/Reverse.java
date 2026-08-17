package stringBuilder;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to reverse it : ");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.println("you reverse string : "+sb);
		sc.close();
	}

}
