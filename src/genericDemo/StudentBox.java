package genericDemo;

class StudentBoxDemo<T>//T is a type parameter. It means the class can work with different data types.
{
	T studId;//The type of studId will be decided when we create the object.
	
	public StudentBoxDemo(T studId) {//It initializes the generic variable.
		this.studId=studId;
	}
	
	void display() {
		System.out.println(studId);
	}
}

public class StudentBox{
	public static void main(String[] args) {
		StudentBoxDemo <Integer> obj= new StudentBoxDemo<>(101);
		obj.display();
		
		StudentBoxDemo <String> obj1=new StudentBoxDemo<>("sank101");
		obj1.display();
		
		
	}

}
