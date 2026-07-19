package employeeManagementSystem;

public class Employee extends Person{
	protected String department;
	protected double salary;
	
	public Employee() {
		
	}
	public Employee(int id, String name ,int age, String department,double salary){
		super(id,name,age);
		this.department=department;
		this.salary=salary;
	}
	// Method 1
	public double calculateAnnualSalary() {
	    return salary*12;
	}

	
	public void checkBonus() {
		if(salary>=50000) {
			System.out.println("Bonus Eligible..");
		}else {
			System.out.println("Not Eligible for Bonus...");
		}
	}
	@Override
	public void display() {
		super.display();		
		System.out.println("department : "+department);
		System.out.println("salary : "+salary);
		
	}

}
