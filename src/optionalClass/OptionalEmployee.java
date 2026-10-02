package optionalClass;
import java.util.*;

class Employee{
	private String name ;
	private int salary;
	
	public Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	static Optional<Employee> findEmployee(){
		Employee emp = new Employee("Sanskruti", 60000);
		return Optional.of(emp);
	}
}

public class OptionalEmployee {
	public static void main(String[] args) {
		
		Optional<Employee> employee = Employee.findEmployee();
		
		employee.filter(emp->emp.getSalary()>15000)
		.filter(emp->emp.getName().startsWith("S"))
		.ifPresent(emp->{
			System.out.println("Name : "+emp.getName());
			System.out.println("Salary : "+emp.getSalary());
		});
		
		
	}
	
	
	

}
