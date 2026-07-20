package thisKeyword;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id :");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the name :");
		String name=sc.nextLine();
		
		System.out.println("Enter the salary :");
		double salary=sc.nextDouble();
		
		Employee emp=new Employee(id,name,salary);
		
		emp.display();
		
		sc.close();
	}

}
