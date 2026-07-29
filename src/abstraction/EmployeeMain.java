package abstraction;
abstract class Employee{
	String company="Google";
	abstract void work();
		
	
	void attendance() {
		System.out.println("Attendance Marked.");
		}
	static void companyPolicy()	{
		 System.out.println("Office Timing : 9 AM");
		}
	final void salaryDay() {
		System.out.println("Salary Credited on 1st of Every Month.");
	}
}
class Developer extends Employee {
	@Override
	void work(){
		 System.out.println("Developer writes code.");
		}
}
class Tester extends Employee{
	@Override
	void work(){
		System.out.println("Tester tests the software.");
	}
}
public class EmployeeMain {
	public static void main(String[] args) {
		Developer d = new Developer();

        System.out.println(d.company);

        d.work();

        d.attendance();

        d.salaryDay();

        Employee.companyPolicy();

        System.out.println();

        Tester t = new Tester();

        System.out.println(t.company);

        t.work();

        t.attendance();

        t.salaryDay();
	}

}
