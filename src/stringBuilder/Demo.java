package stringBuilder;

public class Demo {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello java ");
		sb.append("here is sanskrtui");
		//sb.append(19);
		//sb.append(true);
		
		sb.insert(5," wolrd");
		sb.delete(5, 11);
		sb.deleteCharAt(1);
		sb.replace(0,3,"Hiii");
		
		System.out.println(sb);
		
		StringBuilder str =new StringBuilder("sanskruti");
		str.reverse();
				
		System.out.println(str);
		
		System.out.println(str.charAt(0));
		
		str.setCharAt(1,'e');
		System.out.println(str);
		
		System.out.println(str.length());
		
		//Convert StringBuilder to String
		String s=sb.toString();
		System.out.println(s);
		
		
		
		
		
		
	}

}
