package exceptionHandling;

public class SpecificVsGeneralExample {
	 public static void main(String[] args) {

	        try {
	            int[] numbers = {10, 20, 30};
	            System.out.println(numbers[5]);

	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Specific exception
	            System.out.println("Invalid array index");

	        } catch (Exception e) {
	            // General exception
	            System.out.println("Some other exception occurred");
	        }
	    }
}
