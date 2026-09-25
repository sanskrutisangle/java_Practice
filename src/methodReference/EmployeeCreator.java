package methodReference;
import java.util.function.*;


class Employee{
	private String name;
	public Employee(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println("Employee name : "+name);
	}
}

public class EmployeeCreator {
	public static void main(String[] args) {
		
		Function<String, Employee> data = Employee::new ;
		
		
		Employee emp1=data.apply("sanskruti");
		emp1.display();
		Employee emp2=data.apply("sham");
		emp2.display();
		
	}

}
