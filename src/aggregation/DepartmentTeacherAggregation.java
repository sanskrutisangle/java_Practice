package aggregation;
class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayTeacher() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

class Department {
    String departmentName;
    Teacher teacher;

    Department(String departmentName, Teacher teacher) {
        this.departmentName = departmentName;
        this.teacher = teacher;
    }

    void displayDepartment() {
        System.out.println("Department: " + departmentName);
        teacher.displayTeacher();
    }
}

public class DepartmentTeacherAggregation {
    public static void main(String[] args) {

        // Teacher exists independently
        Teacher t1 = new Teacher("Priya", "Java");

        // Teacher object is passed to Department
        Department d1 = new Department("Computer Engineering", t1);

        d1.displayDepartment();
    }
}
