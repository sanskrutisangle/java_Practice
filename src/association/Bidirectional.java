package association;
class College{
	String name;
	StudentInfo student;
	College(String name){
		this.name=name;
	}
	void showStudent() {
		System.out.println("Student : "+student.name);
	}
	
}
class StudentInfo{
	String name;
	College college;
	StudentInfo(String name){
		this.name=name;
	}
	void showcollege() {
		System.out.println("college : "+college.name);
	}
	
}
public class Bidirectional {
	public static void main(String[] args) {
		StudentInfo student = new StudentInfo("Amit");
        College college = new College("ABC College");
		 student.college = college;
	     college.student = student;
	     student.showcollege();
	      college.showStudent();
	}

}
