package object_typecasting;
class Employee{
	public void work() {
		System.out.print("The employee work on project....");
	}
	
}
class Developer extends Employee {
	public void code() {
		System.out.println("The developer write code for making application...");		
	}
	
}
public class UpcastingEx {
	public static void main(String[] args) {
		Employee emp =new Developer();
		emp.work();
		//emp.code();
		// the compiler says: "I only know that emp is an Employee. Employees don't have a code() method."
		//java looks at the reference type (Employee) to decide which methods can be called.
		//Even though the actual object is Developer, the compiler only allows methods available in the reference type.
	}
	
}
