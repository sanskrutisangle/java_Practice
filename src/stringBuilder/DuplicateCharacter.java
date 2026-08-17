package stringBuilder;

public class DuplicateCharacter {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("javvvaa");
		
		for(int i=0;i<sb.length()-1;i++) {
			if(sb.charAt(i)==sb.charAt(i+1)) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(sb);
	}
}
