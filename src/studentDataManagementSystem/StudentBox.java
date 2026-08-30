package studentDataManagementSystem;

public class StudentBox {
	<T> StudentBox(T value) {

        System.out.println("Value: " + value);
        System.out.println("Type: " + value.getClass().getSimpleName());
    }
}
