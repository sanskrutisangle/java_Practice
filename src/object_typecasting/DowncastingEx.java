package object_typecasting;
class person{
	public void showname() {
		System.out.println("person name is sanskruti");
	}
	
}
class student extends person{
	public void study() {
		System.out.println("student is now study perfectly");
	}
}

public class DowncastingEx {
	public static void main(String[] args) {
		person p=new student();//upcasting
		student s=(student)p;//downcasting
		
		s.showname();// child call can parent because it inherited 
		//The student class automatically gets all the methods of person.
		s.study();
		
		 
	}
}
