package optionalClass;

import java.util.Optional;

public class DefaultUser {
	public static void main(String[] args) {
		
		
		//		orElseGet()
		Optional<String> name=Optional.of("sanskruti");
		
		String myname=name.orElseGet(()->" sangale");
		
		System.out.println(myname);
		
		name.orElse( getDefaultName());
		
		//name.orElseGet(()-> getDefaultName());
		
		
		
		
	}
	
	
	static String getDefaultName() {
	    System.out.println("Default method executed");
	    return "Guest";
	}

}
