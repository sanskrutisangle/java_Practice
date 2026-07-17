package oop_ClassesObjects;

class empex{
	
	void display(int id ,String name) {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		
	}
}

public class EmployeeMethodInitialization {
	public static void main(String[] args) {
		empex e1=new empex();
		e1.display(1,"sanskruti");
	}
	

}
