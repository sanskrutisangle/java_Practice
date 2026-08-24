package exceptionHandling;

public class ExceptionMethodsDemo {
	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int result =a/b;
			
		}catch(ArithmeticException e) {
			System.out.println("Exception Message: " + e.getMessage());

            System.out.println("Stack Trace:");
            e.printStackTrace();
		}
	}

}
