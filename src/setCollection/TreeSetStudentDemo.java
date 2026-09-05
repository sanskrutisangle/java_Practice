package setCollection;
import java.util.TreeSet;
//Student class is agreeing to define how two Student objects should be compared.
/*
 * Why <Student>?

Comparable is a generic interface.

Comparable<Student>

means:

"I want to compare Student objects with other Student objects."
 */


class Student1 implements Comparable<Student1> {

    int rollNo;
    String name;
    int marks;

    Student1(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student1 s) {
        return this.marks - s.marks;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class TreeSetStudentDemo {

    public static void main(String[] args) {

        TreeSet<Student1> students = new TreeSet<>();

        students.add(new Student1(101, "Rahul", 75));
        students.add(new Student1(102, "Priya", 60));
        students.add(new Student1(103, "Amit", 90));
        students.add(new Student1(104, "Sneha", 50));

        for (Student1 s : students) {
            System.out.println(s);
        }
    }
}