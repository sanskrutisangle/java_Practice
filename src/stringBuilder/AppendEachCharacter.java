package stringBuilder;

import java.util.Scanner;

public class AppendEachCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
		sc.close();
	}

}
