package oop_ClassesObjects;

class emp{
	int id;
	String name;
	void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		
	}
}
public class EmployeeReferenceInitialization {
	public static void main(String[] args) {
		emp e1=new emp();
		
		e1.id=101;
		e1.name="sanskruti";
		
		e1.display();
		
		//Here, we directly assign values to the object's variables using the reference variable.
	}

}
