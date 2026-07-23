package inherits;
class Person1{
	String name;
	Person1(String name){
		this.name=name;
		System.out.println("Person Constructor");
        System.out.println("Name : " + name);
	}
}
class Employee extends Person1 {
	int employeeId;
	Employee(String name,int employeeId){
		super(name);
		this.employeeId=employeeId;
		 System.out.println("Employee Constructor");
	        System.out.println("Employee ID : " + employeeId);
	        
	}
	
}
class Professor extends Employee{
	String department;
	Professor(String name,int employeeId,String department){
		super(name,employeeId);
		this.department=department;
		System.out.println("Professor Constructor");
        System.out.println("Department : " + department);
	}
}
public class College {
	public static void main(String[] args) {
		Professor p=new Professor(
				"samiksha sangale",
				101,
				"computer"
				);
		
	}

}
