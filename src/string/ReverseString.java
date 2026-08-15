package string;

public class ReverseString {
	public static void main(String[] args) {
		String str="Hello";
		String rev="";
		
		//for String use length()
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println("reverse String is : " +rev);
	}

}
