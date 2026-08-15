package array;

import java.util.Scanner;

class EmployeeData{
	int id;
	String name;
	double salary;
	String department ;
	
	EmployeeData(int id,String name ,double salary,String department){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	
	
	
}
public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeData[] emp;
		
		System.out.println("Enter the number of emp : ");
		int size=sc.nextInt();
		emp=new EmployeeData[size];
		
		for(int i=0;i<emp.length;i++) {
			
			System.out.println("Employee "+(i+1));
			
			System.out.print("Enter ID: ");
			int id=sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Enter Name: ");
			String name=sc.nextLine();
			
			 System.out.print("Enter Salary: ");
			double salary=sc.nextDouble();
			
			sc.nextLine();
			
			 System.out.print("Enter department: ");
			String department =sc.nextLine();
			
			emp[i]=new EmployeeData(id,name,salary,department); 
		}
		
		System.out.println("Employee Details:");
		
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].id +" "+
					emp[i].name+" "+
					emp[i].salary+" "+
					emp[i].department);
		}
		
		EmployeeData highest = emp[0];

		for (int i = 1; i < emp.length; i++) {

		    if (emp[i].salary > highest.salary) {
		        highest = emp[i];
		    }
		}

		System.out.println("Highest Salary Employee:");
		System.out.println("ID: " + highest.id);
		System.out.println("Name: " + highest.name);
		System.out.println("Salary: " + highest.salary);
		sc.close();
		
	}

}
