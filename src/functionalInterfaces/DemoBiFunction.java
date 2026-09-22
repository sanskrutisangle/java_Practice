package functionalInterfaces;
import java.util.function.*;

public class DemoBiFunction {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add=(a,b)->a+b;
		System.out.println(add.apply(23,30));
	}

}
