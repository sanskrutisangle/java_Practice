package mapCollection;

import java.util.HashMap;

class Student {

    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rollNo);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student other = (Student) obj;

        return this.rollNo == other.rollNo;
    }
}

public class StudentMap {

    public static void main(String[] args) {

        HashMap<Student, Integer> map = new HashMap<>();

        // Store Student objects as keys
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Amit");

        map.put(s1, 85);
        map.put(s2, 90);

        // Create another Student object
        Student s3 = new Student(101, "Rahul");

        // Retrieve marks
        System.out.println(map.get(s3));
    }
}

//Why do we override BOTH?

//
//hashCode()
//
//Helps HashMap find the bucket quickly.
//
//equals()
//
//Helps HashMap check whether the keys are actually equal.



//If two objects are equal according to equals():
//
//s1.equals(s3) == true
//
//then they must have the same hashCode().



//process is:
//
//    s3
//     ↓
//hashCode()
//     ↓
//Find bucket
//     ↓
//Check key using
// equals()
//     ↓
//Same key found
//     ↓
//   85



//Integer.hashCode(rollNo) is a Java method that returns a hash code for the integer value stored in rollNo.