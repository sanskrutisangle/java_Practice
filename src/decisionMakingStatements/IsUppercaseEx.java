package decisionMakingStatements;
import java.util.Scanner;

public class IsUppercaseEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the letter : ");
		char ch = sc.next().charAt(0);
		
		if(ch>='A'&& ch<='Z') {
			System.out.print("The character is an Uppercase Letter.");
		}else {
			System.out.print("The character is not an Uppercase Letter.");
		}
		sc.close();
		
	}

}

/* Suppose

char ch = 'P';

Internally:

ch = 80

When you write:

if(ch >= 'A' && ch <= 'Z')

Java actually evaluates:

if(80 >= 65 && 80 <= 90)*/
