package optionalClass;
import java.util.*;

public class OptionalCreation {
	public static void main(String[] args) {
		
		//Optional.of()
		
		Optional<String> name= Optional.of("sanskruti");
		
		//ifPresent()
		
		name.ifPresent(System.out::println);
		
		//Optional.empty()
		
		Optional<Integer> num=Optional.empty();
		
		
		//isPresent()
		
		if(num.isPresent()) {
			System.out.println(num.get());
		}else {
			System.out.println("empty");
		}
		
		
		//Optional.ofNullable()
		
		Optional<String> msg=Optional.ofNullable(null);
		
		//isempty()
		
		if(msg.isEmpty()) {
			System.out.println("msg is empty");
		}else {
			System.out.println(msg.get());
		}
		
		
			// throw exception 	
//		Optional<String> msg1=Optional.ofNullable(null);
//		
//		System.out.println(msg1.get());
		
		
	}

}
