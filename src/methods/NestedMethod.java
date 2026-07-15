package methods;

public class NestedMethod {
	static int calculate(int square) {
		return square*square;
	}
	static  int  display() {
		return calculate(9);
	}
	public static void main(String[] args) {
		System.out.print(display());
		
	}

}
