package studentDataManagementSystem;

public class StudentDisplay implements Displayable<String >{
	@Override
	public void display(String data) {
        System.out.println("Student Name: " + data);
    }
}
