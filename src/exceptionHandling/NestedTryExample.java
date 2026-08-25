package exceptionHandling;

public class NestedTryExample {
	public static void main(String[] args) {
		try {
			try {
				int[] arr= {10,20,30};
				System.out.println(arr[5]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index is invalid");
			}
			int result =10/0;
			System.out.println(result);
		}catch(ArithmeticException e) {
			 System.out.println("Cannot divide by zero");
		}
	}
}
