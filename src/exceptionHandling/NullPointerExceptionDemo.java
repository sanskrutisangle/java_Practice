package exceptionHandling;

public class NullPointerExceptionDemo {
	public static void main(String[] args) {
		String name=null;
		try {
			System.out.println("the length of string is : "+name.length());
		}
		catch(NullPointerException e){
			System.out.println("String is null. Cannot call a method on null.");
		}
	
	}
	

}
