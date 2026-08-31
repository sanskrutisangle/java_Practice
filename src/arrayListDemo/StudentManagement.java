package arrayListDemo;
import java.util.ArrayList;


class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}
public class StudentManagement {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student(1,"sanskruti"));
		students.add(new Student(2,"samiksha"));
		
		
		
		//students.set(1, new Student(2,"xyz"));
		
		for(int i=0;i<students.size();i++) {
			Student s=students.get(i);
			
			System.out.println(s.id + " " + s.name + " ");
		}
	}

}
