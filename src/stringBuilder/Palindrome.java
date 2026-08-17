package stringBuilder;

public class Palindrome {
	public static void main(String[] args) {
		String str="nitin";
		StringBuilder sb=new StringBuilder(str);
		
		sb.reverse();
		
		if(str.equals(sb.toString())) {
			System.out.println("Palindrome");
		} else {
		    System.out.println("Not Palindrome");
		}
	}

}
