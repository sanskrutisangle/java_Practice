package exceptionHandling;
import java.util.*;

class InvalidAgeException extends Exception{//This creates our own exception class.
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
public class AgeValidationCustom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("enter you age : ");
			int age=sc.nextInt();
			if(age<18) {
				throw new InvalidAgeException("you age is less than 18 so you can not vote");
			}else {
				System.out.println("welcome to vote system");
			}
			
		}catch(InvalidAgeException e) {
			System.out.println("Error found: "+e.getMessage());
		}
		
	}

}
