package basics;

public class default_values {
	
	static int roll_no;
	char grade;
	boolean result;
	
	public static void main(String[] args) {
		
		default_values obj =new default_values();
		
		//int mark; local variable not get default value 
		//System.out.println(mark);
		
		System.out.println(roll_no);
		
		System.out.println(obj.grade);//empty unicode character
		
		System.out.println(obj.result);
		
	}

}
