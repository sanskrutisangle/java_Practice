package functionalInterfaces;
import java.util.function.*;

public class DemoUnaryOperator {
	public static void main(String[] args) {
		UnaryOperator<Integer> mul=(n)->n*n;
		
		System.out.println(mul.apply(2));
	}

}
