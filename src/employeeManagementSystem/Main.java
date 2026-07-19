package employeeManagementSystem;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        EmployeeService service = new EmployeeService();
        while (true) {

            System.out.println("\n==================================");
            System.out.println(" Employee Management System");
            System.out.println("==================================");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Calculate Annual Salary");
            System.out.println("6. Check Bonus Eligibility");
            System.out.println("7. Wrapper Class Demo");
            System.out.println("8. Primitive Type Casting Demo");
            System.out.println("9. Object Type Casting Demo");
            System.out.println("10. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();
            
            switch(choice) {
            case 1 :
            	service.addEmployee();
            	break;
            case 2:
            	service.displayEmployees();
            	break;
            case 3:
            	System.out.println("Enter the id of employee :");
            	int id=sc.nextInt();
            	Employee emp = service.searchEmployee(id);
            	if(emp!=null) {
            		emp.display();
            	}else {
            		System.out.println("Employee Not Found.");
            	}  
            	break;
            case 4:
            	service.updateSalary();
                break;

            case 5:
                service.annualSalary();
                break;

            case 6:
                service.checkBonus();
                break;
            case 7:
            	System.out.println("\n===== Wrapper Class Demo =====");

                String age = "25";
                String salary = "55000.50";

                int a = Integer.parseInt(age);
                double s = Double.parseDouble(salary);

                System.out.println("Age = " + a);
                System.out.println("Salary = " + s);

                break;
              
            case 8:
            	 System.out.println("\n===== Primitive Type Casting =====");

                 int number = 50;

                 double d = number;     // Widening

                 System.out.println("Int Value = " + number);
                 System.out.println("Double Value = " + d);

                 double marks = 89.75;

                 int m = (int) marks;   // Narrowing

                 System.out.println("Original = " + marks);
                 System.out.println("After Casting = " + m);

                 break;
            case 9:
            	System.out.println("\n===== Object Type Casting =====");

                // Upcasting
                Person p = new Manager(101,
                        "Rahul",
                        30,
                        "HR",
                        65000,
                        8);

                p.display();

                // Downcasting

                if (p instanceof Manager) {

                    Manager manager = (Manager) p;

                    System.out.println("Downcasting Successful.");

                    manager.display();

                }

                break;
            case 10:

                System.out.println("Thank You!");

                break;

            default:

                System.out.println("Invalid Choice.");
                
            }
            if (choice == 10) {
                break;
            }
	}
        sc.close();
	}

}
