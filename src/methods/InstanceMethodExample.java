package methods;

public class InstanceMethodExample {
	String name ="sanskruti";
	int age=18;
	static String collegeName="SIEM";
	void stuentInfo() {
		System.out.println(name);//An instance method can directly access instance variable
		System.out.println(age);
		System.out.println(collegeName);//An instance method can directly access static variables.
		
			}
	static void demo() {
		System.out.println("this  is Static method ");
	}
	void display() {
		stuentInfo();//An instance method can call another instance method directly.
		demo();//An instance method can call a static method directly.
	}
	
	public static void main(String[] args) {
		
	}
}
