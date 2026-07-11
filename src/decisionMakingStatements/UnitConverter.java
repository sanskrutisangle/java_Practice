package decisionMakingStatements;
import java.util.Scanner;

public class UnitConverter {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UNIT CONVERTER =====");
        System.out.println("1. Meter to Kilometer");
        System.out.println("2. Kilometer to Meter");
        System.out.println("3. Meter to Centimeter");
        System.out.println("4. Centimeter to Meter");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        System.out.print("Enter value:");
        int value =sc.nextInt();
        
        switch(choice) {
        case 1 : 
        	System.out.println("result : "+(value/1000));
        	break;
        case 2 : 
        	System.out.print("result : " +(value*1000));
        	break;
        case 3 : 
        	System.out.println("result :"+(value*100));
        	break;
        case 4 :
        	System.out.print("result :"+(value/100));
        	break;
        default:
            System.out.println("Invalid Choice");
        }
        	sc.close();
        
	}
}
