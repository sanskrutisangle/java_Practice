package stringBuffer;

public class ReverseEachWord {
	public static void main(String[] args) {
	String str="hello java";
	
	StringBuffer result=new StringBuffer();
	
	String[] words = str.split(" ");
	
	for(String word : words) {
		StringBuffer sb=new StringBuffer(word);
		result.append(sb.reverse().append(" "));
	}
	System.out.println(result);
	}

}
