package abstraction;
abstract class EmployeeEx{
	
	EmployeeEx(String name){
		System.out.println("Company : "+name);
	}
	abstract void work();
	void login(){
		System.out.println("Employee must have to login ");
	}
}
class DeveloperEx extends EmployeeEx{
	DeveloperEx(){
		super("TCS");
	}
	@Override
	void work() {
		System.out.println("deverloper write a code ");
	}
}
class TesterEx extends EmployeeEx{
	TesterEx(){
		super("google");
	}
	@Override
	void work() {
		System.out.println("test the software ");
	}
}
public class EmployeeManagement {
	public static void main(String[] args) {
		EmployeeEx emp;
		
		emp=new DeveloperEx();
		emp.login();
		emp.work();
		
		emp =new TesterEx();
		emp.login();
		emp.work();
		
	}
	

}
