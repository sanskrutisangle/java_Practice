package encapsulation;
class EmployeeInfo {
	private String name ;
	private double salary;
	public void setname(String name) {
		this.name=name;
	}
	public void setsalary(double salary) {
		if(salary<=0) {
			System.out.println("invalid salary . ");
			}else {
				this.salary=salary;
			}
	}
	public String getname() {
		return name;
	}
	public double getsalarye() {
		return salary;
	}
	
}
public class Employee {
	public static void main(String[] args) {
		EmployeeInfo emp=new EmployeeInfo();
		emp.setname("sanskruti");
		emp.setsalary(0.00);
		System.out.println(emp.getname());
		System.out.println(emp.getsalarye());
	}

}
