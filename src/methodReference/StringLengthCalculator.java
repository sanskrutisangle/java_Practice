package methodReference;
import java.util.function.*;

public class StringLengthCalculator {
	public static void main(String[] args) {
		Function<String,Integer> msg=String::length;
		System.out.println(msg.apply("java"));
		
	}

}
