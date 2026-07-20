package thisKeyword;

public class Employee {
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void calculateAnnualSalary()
	{
		double annualSalary = salary*12;
		System.out.println("Annual Salary : "+annualSalary);
	}
	void display() {
			System.out.println("id : "+id);
			System.out.println("name : "+name);
			System.out.println("monthly salary : "+salary);
			this.calculateAnnualSalary();
	}
}
