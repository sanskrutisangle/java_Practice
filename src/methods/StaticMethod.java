package methods;

public class StaticMethod {
	static int x=10;//A static method can directly access only static members.
	void demo() {
		System.out.println("this is non static method ");
	}
	
	static void display() {
		StaticMethod obj=new StaticMethod();//A static method cannot directly access non-static members.
		obj.demo();
		System.out.println(x);
	}
	void test() {
		demo();
		display();//Non-Static Calling Both Static and Non-Static
	}
	public static void main(String[] args) {

        display();
    }

}
