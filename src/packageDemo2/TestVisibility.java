package packageDemo2;
import packageDemo1.Employee;

public class TestVisibility extends Employee {
	public static void main(String[] args) {
		Employee emp = new Employee();
		TestVisibility obj=new TestVisibility();

		//System.out.println(emp.empid);
		System.out.println(emp.name);
		System.out.println(obj.salary);//for accessing protected variable create child class obj
		//System.out.println(emp.password);
	}

}
// for accessign Instance variable → object required
// for Static variable → object not required acceess using class name 