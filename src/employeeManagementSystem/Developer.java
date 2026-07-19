package employeeManagementSystem;

public class Developer extends Employee {
	protected String programmingLanguage;
	
	public Developer(int id, String name ,int age, String department,double salary,String programmingLanguage) {
		super(id,name,age,department,salary);
		this.programmingLanguage=programmingLanguage;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("programming Language : "+ programmingLanguage);
		
	}

}
