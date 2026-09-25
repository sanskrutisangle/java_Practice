package methodReference;
import java.util.function.*;

public class MessageLength {
	public static void main(String[] args) {
		String msg="Java Programming";
		
		Supplier<Integer> task=msg::length;//Particular Object Method Reference
		
		System.out.println(task.get());
		
		
	}

}
