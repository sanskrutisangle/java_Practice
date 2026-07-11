package decisionMakingStatements;
import java.util.Scanner;

public class LoginSystem {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        String correctusername="user123";
	        String correctpassword="pass123";
	        
	        System.out.println("enter username :");
	        String username =sc.nextLine();
	        System.out.println("enetr password :");
	        String password=sc.nextLine();
	        
	        if(correctusername.equals(username)) {
	        		if(correctpassword.equals(password)) {
	        			System.out.println("Login Successful!");
	        		}else {
	        			System.out.println("Incorrect Password!");
	        		}
	        }else {
	        	 System.out.println("Invalid Username!");
	        }
	        sc.close();
	    }

}
