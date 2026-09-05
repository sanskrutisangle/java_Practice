package setCollection;

import java.util.TreeSet;

class StudentData {

    int rollNo;
    String name;
    int marks;

    StudentData(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class TreeSetTrickyDuplicate {

    public static void main(String[] args) {

        TreeSet<StudentData> set = new TreeSet<>(
           (s1,s2)->{
        	   int result=Integer.compare(s1.marks,s2.marks);
        	   if(result==0) {
        		   result=Integer.compare(s1.rollNo,s2.rollNo);
        	   }
        	   return result;
           }
        );

        set.add(new StudentData(101, "Amit", 80));
        set.add(new StudentData(102, "Rahul", 80));
        set.add(new StudentData(103, "Sneha", 90));

        for (StudentData s : set) {
            System.out.println(s);
        }

        System.out.println("Size: " + set.size());
    }
}