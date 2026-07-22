package inherits;
class student {
    protected int rollNo;
    protected String name;
    protected String course;

    public student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public void displayStudentDetails() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
    }
}

// Child Class 1
class EngineeringStudent extends student {

    public EngineeringStudent(int rollNo, String name, String course) {
        super(rollNo, name, course);
    }

    public void submitProject() {
        System.out.println("Project submitted successfully.");
    }
}

// Child Class 2
class MedicalStudent extends student {

    public MedicalStudent(int rollNo, String name, String course) {
        super(rollNo, name, course);
    }

    public void attendHospitalTraining() {
        System.out.println("Hospital training completed.");
    }
}

// Child Class 3
class CommerceStudent extends student {

    public CommerceStudent(int rollNo, String name, String course) {
        super(rollNo, name, course);
    }

    public void prepareBalanceSheet() {
        System.out.println("Balance sheet prepared successfully.");
    }
}

    
public class CollegeManagementSystem {
	public static void main(String[] args) {

        EngineeringStudent eng = new EngineeringStudent(
                101, "Sanskruti", "Computer Engineering");

        MedicalStudent med = new MedicalStudent(
                102, "Aarav", "MBBS");

        CommerceStudent com = new CommerceStudent(
                103, "Priya", "B.Com");

        System.out.println("----- Engineering Student -----");
        eng.displayStudentDetails();
        eng.submitProject();

        System.out.println();

        System.out.println("----- Medical Student -----");
        med.displayStudentDetails();
        med.attendHospitalTraining();

        System.out.println();

        System.out.println("----- Commerce Student -----");
        com.displayStudentDetails();
        com.prepareBalanceSheet();
    }

}
