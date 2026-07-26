package polymorphism;
class A{
	void display() {
		System.out.println("parent class");
	}
}
class B extends A{
	@Override
	void display() {
		
		System.out.println("child class");
	}
	
}
public class MethodOverridngEx {
	public static void main(String[] args) {
		A obj =new B();
		obj.display();
	}
}
