package exceptionHandling;

public class AgeValidator {
	public static void agechecker(int age) {
		if(age<18) {
			throw new IllegalArgumentException("Invalid age");
		}
		System.out.println("You are eligible to vote.");
	}
	public static void main(String[] args) {
		agechecker(23);
	}
}
