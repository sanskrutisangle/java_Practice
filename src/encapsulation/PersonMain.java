package encapsulation;

class Person{
	private String name;
	private int age;
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
}
class StudentEx extends Person {
	public StudentEx(String name,int age){
		super(name, age);
	}
	public void display() {
		System.out.println("Name : " + getname());
        System.out.println("Age  : " + getage());
	}
}
public class PersonMain {
	public static void main(String[] args) {
		StudentEx obj=new StudentEx("sanskruti",21);
		obj.display();
	}
	
}
