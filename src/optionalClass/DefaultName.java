package optionalClass;

import java.util.Optional;

public class DefaultName {
	public static void main(String[] args) {
		Optional<String> name =Optional.of("sanskruti");
		
		//orElse()
		
		System.out.println(name.orElse(" sangale"));//it give default value only when the variable is null
		
		Optional<String>name1 =Optional.ofNullable(null);
		System.out.println(name1.orElse("sanskruti"));
		
		
		//
		
	
	}

}
