package oop_ClassesObjects;
import java.util.*;

class student{
	String name;
	int age;
	String branch;
	int year;
	int roll_no;
	String email;
	void display() {
		System.out.println("================Information of student================ ");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Branch :"+branch);
		System.out.println("Year   :"+year);
		System.out.println("Roll NO : "+roll_no);
		System.out.println("Email : "+email);
	}
}
public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		student s1=new student();//first student 
		System.out.println("Enter you name : ");
		s1.name=sc.nextLine();
		
		System.out.println("Enter you Age : ");
		s1.age=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter you branch : ");
		s1.branch=sc.nextLine();
		
		System.out.println("Enter you Year of study : ");
		s1.year=sc.nextInt();
		
		System.out.println("Enter you roll no : ");
		s1.roll_no=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter you email : ");
		s1.email=sc.nextLine();
		
		
		student s2=new student();//second student
		
		System.out.println("Enter you name : ");
		s2.name=sc.nextLine();
		
		System.out.println("Enter you Age : ");
		s2.age=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter you branch : ");
		s2.branch=sc.nextLine();
		
		System.out.println("Enter you Year of study : ");
		s2.year=sc.nextInt();
		
		System.out.println("Enter you roll no : ");
		s2.roll_no=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter you email : ");
		s2.email=sc.nextLine();
		
		System.out.println("student 1:");
		s1.display();
		
		System.out.println();
		
		System.out.println("student 2:");
		s2.display();
		
		sc.close();
		
	}

}

