package stringBuffer;

public class Palindrome {
	public static void main(String[] args) {
		String og="nitin";
		StringBuffer sb =new StringBuffer(og);
		
		String str = sb.reverse().toString();
		
		if(og.equals(str)) {
			System.out.println("Palindrome");
		} else {
		    System.out.println("Not Palindrome");
		}
	}

}
