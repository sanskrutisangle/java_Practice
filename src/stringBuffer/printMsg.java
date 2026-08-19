package stringBuffer;

public class printMsg {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("sanskruti");
		sb.append("sangale");
		System.out.println(sb);
		
		sb.delete(0, 3);
		
		StringBuffer s1=new StringBuffer(" is programming lang");
		
		s1.insert(0,"java");
		System.out.println(s1);
		
		s1.replace(0, 3,"A java ");
		System.out.println(s1);
		
		s1.deleteCharAt(12);
		System.out.println(s1);
		
		s1.setCharAt(1, 'A');
		System.out.println(s1);
		
	}

}
