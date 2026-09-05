package setCollection;

import java.util.HashSet;

class Student{
	int roll;
	String name;
	public Student(int roll,String name) {
		this.roll=roll;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;//Object reference into a Student reference.
		
		return this.roll==s.roll && this.name.equals(s.name);
	}
	
	@Override
	public int hashCode() {
		return roll+name.hashCode();
	}
}
/*
 *  our hashCode() method produces the same hash value for both.

Then HashSet uses equals() to confirm whether they are actually equal.
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s1=new Student(101,"sanskruti");
		Student s2=new Student(101,"sanskruti");
		
		HashSet<Student>set=new HashSet<>();
		
		set.add(s1);
		set.add(s2);
		System.out.println(set.size());
		
	}

}
