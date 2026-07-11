package userInput;
import java.util.Scanner;

public class userInputEx1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//read age of user
		System.out.print("Enter you Age: ");
		int age=sc.nextInt();
		//display age 
		System.out.println("Age : "+age); 
		
		System.out.println("Enter phone number :");
		long phoneno=sc.nextLong();
		System.out.println("phone no : "+phoneno);
		//read char 
		
		sc.close();
		
		
	}

}
