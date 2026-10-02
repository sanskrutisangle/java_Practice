package optionalClass;
import java.util.*;

public class OptionalStatus {
	public static void main(String[] args) {
		Optional<String> employee = Optional.empty();
								// if  found
		employee.ifPresentOrElse(value->System.out.println("emp found"),()->System.out.println("default emp "));
																		//if not found
		
	}

}
