package interfaceEx;

interface Animal1{
	interface pet{//Nested interfaces are implicitly public static.
		void play();
	}
}
class Dog implements Animal1.pet{//Nested Interface be implemented by a class
	@Override
	public void play() {
		System.out.println("");
	}
}
public class NestedInterface {
	public static void main(String[] args) {
		
	}

}
