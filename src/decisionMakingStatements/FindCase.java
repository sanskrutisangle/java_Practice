package decisionMakingStatements;
import java.util.Scanner;

public class FindCase {
		    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);
            
	        if(ch>='A'&&ch<='Z') {
	        	System.out.print(ch + " is an Uppercase letter.");
	        }else if(ch>='a'&&ch<='z') {
	        	 System.out.println(ch + " is a Lowercase letter.");
	        }else {
	        	 System.out.println("Invalid Input! Please enter an alphabet.");
	        }
	        sc.close();	
	        }
}

