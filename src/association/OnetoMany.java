package association;
import java.util.ArrayList;
import java.util.List;

class Student1 {

    String name;

    Student1(String name) {
        this.name = name;
    }
}
class Teacher1 {

    String name;
    List<Student1> students = new ArrayList<>();   // Association

    Teacher1(String name) {
        this.name = name;
    }

    void addStudent(Student1 student) {
        students.add(student);
    }

    void displayStudents() {

        System.out.println("Teacher: " + name);
        System.out.println("Students:");

        for (Student1 student : students) {
            System.out.println(student.name);
        }
    }
}

public class OnetoMany {
	public static void main(String[] args) {
		Teacher1 teacher = new Teacher1("Rahul");

        Student1 student1 = new Student1("Amit");
        Student1 student2 = new Student1("Priya");
        Student1 student3 = new Student1("Sneha");

        teacher.addStudent(student1);
        teacher.addStudent(student2);
        teacher.addStudent(student3);

        teacher.displayStudents();
	}
}
