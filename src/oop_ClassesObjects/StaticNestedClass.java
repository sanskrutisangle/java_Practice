package oop_ClassesObjects;
class College{
	static class Student{
		void display() {
            System.out.println("Inside Static Nested Class");
        }
	}
}
public class StaticNestedClass {
	public static void main(String[] args) {
		College.Student obj=new College.Student();
		obj.display();
	}

}
