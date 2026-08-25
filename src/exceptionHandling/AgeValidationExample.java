package exceptionHandling;

public class AgeValidationExample {
	static void checkAge(int age) throws Exception{
		if(age<18) {
		throw new Exception("your are not eligible for vote");
		}
		System.out.println("you can vote ");
	}
	static void validateAge(int age) {
		if(age<18) {
			throw new IllegalArgumentException("your are not eligible for vote");
		}
		System.out.println("you can vote ");
		
	}
	public static void main(String[] args) {
		try {
			checkAge(15);
	        validateAge(16);
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}
		
	}

}
