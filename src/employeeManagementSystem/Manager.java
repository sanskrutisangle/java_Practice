package employeeManagementSystem;

public class Manager extends Employee {
	protected int teamSize;
	 
	public Manager(int id, String name ,int age, String department,double salary,int teamSize){
		super(id,name,age,department,salary);
		this.teamSize=teamSize;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Team Size : "+teamSize);
	}
	
	
}
