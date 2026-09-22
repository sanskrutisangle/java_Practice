package functionalInterfaces;
import java.util.function.*;

public class DemoConsumer {
	public static void main(String[] args) {
		Consumer<String> task=name->System.out.println(name);
		task.accept("sanskruti");
	}

}
