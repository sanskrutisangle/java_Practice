package methodReference;
import java.util.function.*;

public class NumberAddition {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add=Integer::sum;
		//BiFunction<Integer,Integer,Integer> task=(a,b)->a+b;
		BiFunction<Integer,Integer,Integer> task=(a,b)->Integer.sum(a, b);
		
		System.out.println(add.apply(12, 12));
		System.out.println(add.apply(2, 1));
		System.out.println(task.apply(12,12));
		
		
	}

}
