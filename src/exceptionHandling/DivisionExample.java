package exceptionHandling;

public class DivisionExample {
	static void divide(int a,int b)throws ArithmeticException {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		divide(10,0);
	}

}
