package aggregation;
class Student{
	String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

	 void displayStudent() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Roll No: " + rollNo);
	    }
}
class College{
	String collegeName;
    Student student;   // HAS-A relationship

    College(String collegeName, Student student) {
        this.collegeName = collegeName;
        this.student = student;
    }

    void displayCollege() {
        System.out.println("College Name: " + collegeName);
        student.displayStudent();
    }
	
}

public class Basis {
	public static void main(String[] args) {
		// Student object is created independently
        Student s1 = new Student("Rahul", 101);

        // Passing Student object to College
        College c1 = new College("K K Wagh", s1);

        c1.displayCollege();

        // Student can still be accessed independently
        s1.displayStudent();
		
	}

}
