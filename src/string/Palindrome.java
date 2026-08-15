package string;

public class Palindrome {
	public static void main(String[] args) {
		String str="sanskruti";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(str+" is Palindrome");
		}else {
			System.out.println(str+" is not  Palindrome");
		}
	}

}
