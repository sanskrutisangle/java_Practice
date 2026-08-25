package exceptionHandling;

public class PasswordValidator {
	public static void validatePassword(String password) {
		if(password.length()<8) {
			throw new IllegalArgumentException("Password must contain at least 8 characters");
		}
		System.out.println("Password is valid.");
	}
	public static void main(String[] args) {
		validatePassword("1234");
	}

}
