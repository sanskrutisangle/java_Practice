package decisionMakingStatements;
import java.util.Scanner;

	public class EmployeeBonus {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter years of experience: ");
	        int experience = sc.nextInt();

	        int bonus = 0;
	        if( experience<0) {
	        	 System.out.println("Invalid experience.");
	        }else if( experience<=2) {
	        	bonus=0;
	               	
	        }else if( experience<=5) {
	        	bonus=2000;
	        	
	        }else if( experience<=10) {
	        	bonus=5000;
	        	
	        }else {
	        	bonus=10000;
	        }
	        if (experience >= 0) {
	            System.out.println("Years of Experience : " + experience);
	            System.out.println("Bonus               : ₹" + bonus);
	        }

	        sc.close();
	    }
}
