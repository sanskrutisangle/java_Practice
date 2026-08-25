package exceptionHandling;

public class NestedTryStringExample {
	public static void main(String[] args) {
		try {
			try {
				String s=null;
				System.out.println(s.length());
			}catch(NullPointerException e) {
				 System.out.println("String is null");
			}
			try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index");
            }
		}catch(Exception e) {
			System.out.println("Outer catch executed");
		}
	}

}
