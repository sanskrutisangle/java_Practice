//package mapCollection;
//import java.util.*;
//
//class Student {
//
//    int rollNo;
//    String name;
//    int marks;
//
//    Student(int rollNo, String name, int marks) {
//        this.rollNo = rollNo;
//        this.name = name;
//        this.marks = marks;
//    }
//
//    void display() {
//        System.out.println(
//            "Roll No: " + rollNo +
//            ", Name: " + name +
//            ", Marks: " + marks
//        );
//    }
//}
//public class StudentMarks {
//	public static void main(String[] args) {
//		
//		// Roll No → Student Object
//        HashMap<Integer, Student> map = new HashMap<>();
//
//        // 1. Add students
//        map.put(101, new Student(101, "Rahul", 85));
//        map.put(102, new Student(102, "Amit", 72));
//        map.put(103, new Student(103, "Sneha", 91));
//        map.put(104, new Student(104, "Priya", 68));
//        
//     // 2. Display all students
//        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
//
//            System.out.println("Key: " + entry.getKey());
//
//            Student student = entry.getValue();
//
//            student.display();
//
//            System.out.println();
//            
//                 }
//     // 3. Find student using roll number
//        Student student = map.get(102);
//
//        System.out.println("Student with roll no 102:");
//        student.display();
//        
//        //update
//        System.out.println(map.get(104).marks = 80);
//        
//     // 5. Remove student
//        map.remove(104);
//
//        System.out.println("\nAfter removing student 104:");
//
//        for (Student s : map.values()) {
//            s.display();
//        }
//        
//     // 6. Check whether roll number exists
//        if (map.containsKey(103)) {
//            System.out.println("\nRoll number 103 exists");
//        }
//        
//     // 7. Find student with highest marks
//
//        Student highestStudent = null;
//
//        for (Student s : map.values()) {
//
//            if (highestStudent == null ||
//                s.marks > highestStudent.marks) {
//
//                highestStudent = s;
//            }
//        }
//
//        System.out.println("\nStudent with highest marks:");
//        highestStudent.display();
//        
//	}
//
//}
