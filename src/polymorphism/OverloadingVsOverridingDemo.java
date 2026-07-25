package polymorphism;
class Parent{
	void show(int i) {
		System.out.println("parent Integer: " + i);
	}
	void show(double d) {
		System.out.println("parent Double: " + d);
	}
}
class Child extends Parent{
	@Override
	void show(int i) {
		System.out.println("Child Integer: " + i);
	}
	@Override 
	void show(double d) {
		System.out.println("Child Doubler: " + d);
	}
	
}
public class OverloadingVsOverridingDemo {
	public static void  main(String[] args) {
		Parent p=new Child();
		p.show(9);
		p.show(9.0);
	}
	/*
	 *Compiler chooses the correct overloaded method based on the arguments.
JVM executes the overridden method from the child class.
	 */

}
