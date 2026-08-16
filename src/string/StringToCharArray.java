package string;

public class StringToCharArray {
	public static void main(String[] args) {
		String str="sanskruti";
		char[] ch=str.toCharArray();//It is useful when you want to process every character individually
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println(ch[0]);
	}

}
