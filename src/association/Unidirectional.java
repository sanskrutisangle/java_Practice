package association;
class Teacher{
	String name;
	Teacher(String name){
		this.name=name;
	}
	void teach() {
		System.out.println(name+"is teaching");
	}
}
class student{
	String name ;
	Teacher teacher;
	student(String name,Teacher teacher){
		this.name=name;
		this.teacher=teacher;
	}
	void learn() {
		System.out.println(name+" is learning from "+teacher.name);
		teacher.teach();
	}
}
public class Unidirectional {
	public static void main(String[] args) {
		Teacher teacher =new Teacher("amit sir ");
		student student =new student("sanskruti",teacher);//Only Student knows about Teacher.
		student.learn();
	}

}
