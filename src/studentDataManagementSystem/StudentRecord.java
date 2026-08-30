package studentDataManagementSystem;

public class StudentRecord <T , K>{
	T id;
	K data;
	
	public StudentRecord(T id,K data) {
		this.id=id;
		this.data=data;
	}
	
	void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Data: " + data);
    }
}
