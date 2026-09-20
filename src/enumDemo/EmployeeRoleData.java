package enumDemo;


enum EmployeeRole{
	DEVELOPER(101,"abc"),
	TESTER(102,"pqr"),
	MANAGER(103,"xyz");
	
	
	int id;
	String name;
	
	EmployeeRole(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	void display() {
		System.out.println("id : "+ id);
		System.out.println("name : "+name);
	}
}

public class EmployeeRoleData {
	public static void main(String[] args) {
		EmployeeRole e=EmployeeRole.DEVELOPER;
		e.display();
	}

}
