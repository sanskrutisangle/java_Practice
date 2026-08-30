package studentDataManagementSystem;

public class GenericUtility {
	static <T> void display(T data) {
		System.out.println("Value: " + data);
        System.out.println("Type: " + data.getClass().getSimpleName());
	}

}
