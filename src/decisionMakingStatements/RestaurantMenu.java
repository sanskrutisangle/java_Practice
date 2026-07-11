package decisionMakingStatements;
import java.util.Scanner;

public class RestaurantMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== Restaurant Menu =====");
        System.out.println("1. Pizza      - ₹250");
        System.out.println("2. Burger     - ₹120");
        System.out.println("3. Sandwich   - ₹100");
        System.out.println("4. Pasta      - ₹180");
        System.out.println("5. Coffee     - ₹80");

        System.out.print("\nEnter your choice (1-5): ");
        int choice=sc.nextInt();
        
        switch(choice) {
        case 1:
            System.out.println("You ordered Pizza.");
            System.out.println("Price = ₹250");
            break;

        case 2:
            System.out.println("You ordered Burger.");
            System.out.println("Price = ₹120");
            break;

        case 3:
            System.out.println("You ordered Sandwich.");
            System.out.println("Price = ₹100");
            break;

        case 4:
            System.out.println("You ordered Pasta.");
            System.out.println("Price = ₹180");
            break;

        case 5:
            System.out.println("You ordered Coffee.");
            System.out.println("Price = ₹80");
            break;
          
        default:
            System.out.println("Invalid choice! Please select a number between 1 and 5.");
        	
        }
		sc.close();
		
	}

}
