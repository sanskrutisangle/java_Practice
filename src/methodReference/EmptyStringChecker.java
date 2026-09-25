package methodReference;
import java.util.function.*;

public class EmptyStringChecker {
	public static void main(String[] args) {
		Predicate<String> msg=String::isEmpty;
		
		System.out.println("the give String is empty or not : ");
		System.out.println(msg.test("sanskruti"));		
	}

}
