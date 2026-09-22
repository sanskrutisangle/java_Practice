package functionalInterfaces;
import java.util.function.*;

public class DemoIntPredicate {
	public static void main(String[] args) {
		IntPredicate task=a->a%2==0;
		System.out.println("even "+task.test(89));
		
	}

}
