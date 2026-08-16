package stringBuilder;

import java.util.Scanner;

public class PrintCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter you string ");
		String str=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(str);
		
		for(int i=0;i<sb.length();i++) {
			System.out.print(sb.charAt(i));
		}
		sc.close();
		
	}

}
