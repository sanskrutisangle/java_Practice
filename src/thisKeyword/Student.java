package thisKeyword;

public class Student {
	int id;
	String name;
	double mark;
	
	Student(){
		System.out.println("Default Constructor Called");
	}
	Student(int id,String name,double mark){
		this();
		this.id=id;
		this.name=name;
		this.mark=mark;
	}
	void updateMarks(double mark) {
		this.mark=mark;
		
	}
	void display() {
		System.out.println("id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Mark : "+mark);
	}
}
