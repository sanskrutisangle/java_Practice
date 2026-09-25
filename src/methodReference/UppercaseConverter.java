package methodReference;
import java.util.function.*;

public class UppercaseConverter {
	public static void main(String[] args) {
		Function<String,String> msg=String::toUpperCase;//instance method reference
		
		System.out.println(msg.apply("sanskruti"));
		
	}
}
