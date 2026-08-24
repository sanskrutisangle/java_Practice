package exceptionHandling;

public class FinallyDemo {
	public static void main(String[] args) {
		// Case 1: Exception occurs
        System.out.println("Case 1: Exception occurs");

        try {
            int result = 10 / 0;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            System.out.println("Finally block executed.");
        }
        
     // Case 2: Exception does not occur
        System.out.println("\nCase 2: Exception does not occur");

        try {
            int result = 10 / 2;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            System.out.println("Finally block executed.");
        }

	}

}
