package functionalInterfaces;
import java.util.function.*;

public class DemoBinaryOperator {
	public static void main(String[] args) {
		BinaryOperator<Integer> div=(a,b)->a/b;
		System.out.println(div.apply(10, 3));
	}

}
