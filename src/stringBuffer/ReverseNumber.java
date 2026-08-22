package stringBuffer;

public class ReverseNumber {
	public static void main(String[] args) {
		int a=1234;
		StringBuffer sb=new StringBuffer(String.valueOf(a));//Convert the number into a String, then put that String inside a StringBuffer.
		
		sb.reverse();
		System.out.println(sb);
	}
}
