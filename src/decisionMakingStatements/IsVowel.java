package decisionMakingStatements;
import java.util.Scanner;

public class IsVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter letter : ");
		char ch=sc.next().charAt(0);
		if((ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z')) {
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.print(ch + " is a Vowel.");
			}else{
				System.out.println(ch + " is a Consonant.");
			}
		}else{
			System.out.print("Invalid Input! Please enter an alphabet.");
		}
		sc.close();
	}
	

}
