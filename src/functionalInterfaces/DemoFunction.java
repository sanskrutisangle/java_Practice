package functionalInterfaces;
import java.util.function.*;

public class DemoFunction {
	public static void main(String[] args) {
		Function<Integer,Integer> task=n->n*n;
		System.out.println(task.apply(2));
	}

}
