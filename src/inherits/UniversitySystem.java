package inherits;
class Person{
	int id;
	String  name;
	int age;
	Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
	void displayPerson() {
        System.out.println("ID        : " + id);
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
    }
}
class Student extends Person{
	 String course;
	 int semester;
	 Student(int id, String name, int age,
	            String course, int semester) {

	        super(id, name, age);
	        this.course = course;
	        this.semester = semester;
	    }
	 void displayStudent() {
	        super.displayPerson();

	        System.out.println("Course    : " + course);
	        System.out.println("Semester  : " + semester);
	    }
}
class PlacementStudent extends Student {
	String  companyName;
	 double packageOffered;
	 PlacementStudent(int id, String name, int age,
             String course, int semester,
             String companyName, double packageOffered) {

			super(id, name, age, course, semester);
			
			this.companyName = companyName;
			this.packageOffered = packageOffered;
			}

	 void displayPlacement() {

	        super.displayStudent();

	        System.out.println("Company   : " + companyName);
	        System.out.println("Package   : " + packageOffered + " LPA");
	    }
}
public class UniversitySystem {
	public static void main(String[] args) {
		PlacementStudent obj =new PlacementStudent(
				101,
                "Sanskruti",
                20,
                "computer",
                5,
                "TCS",
                8.5
				);
		obj.displayPlacement();
		
	}

}
