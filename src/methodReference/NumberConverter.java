package methodReference;
import java.util.function.*;

public class NumberConverter {
	public static void main(String[] args) {
		Function<String,Integer> task=Integer::parseInt;//Static method reference
		
		System.out.println(task.apply("8909987"));
		System.out.println(task.apply("1234"));
	}

}
