package stringBuffer;

public class RemoveSpaces {
	public static void main(String[] args) {
		String str="hello java";
		StringBuffer sb=new StringBuffer(str);
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				sb.deleteCharAt(i);
			}
		}
		System.out.println(sb);
	}

}
