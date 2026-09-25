package methodReference;
import java.util.function.*;

public class PrintMsg {
	public static void main(String[] args) {
		Consumer<String> msg=System.out::println;//instance method reference
		
		msg.accept("hello java ");
				
	}

}
