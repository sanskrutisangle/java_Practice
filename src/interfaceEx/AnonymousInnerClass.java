package interfaceEx;

interface Animal{
	void sound();
}
public class AnonymousInnerClass {
	public static void main(String[] args) {
		Animal a=new Animal() {
			@Override
			public void sound() {
				System.out.println("");
			}
		};
		a.sound();
	}


}
