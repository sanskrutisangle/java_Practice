package employeeManagementSystem;

public class Person {
	protected int id;
	protected String name;
	protected int age;
	// Default Constructor
	public Person(){
		
	}
	// Parameterized Constructor
	public Person(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	void display() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	
}