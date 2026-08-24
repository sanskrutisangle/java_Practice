package exceptionHandling;

public class MultipleCatchDemo {
	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			
			int result=a/b;
			
			int[] arr= {10,20,30,40};
			
			System.out.println("at index 5 : "+arr[5]);
		}
		 catch (NumberFormatException e) {
	            System.out.println("Invalid number format!");
	        }

	        catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero!");
	        }

	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Invalid array index!");
	        }
	}

}
