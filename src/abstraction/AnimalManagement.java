package abstraction;

abstract class Animal{
	
	Animal(){
		System.out.println("Animal Constructor Called");
	}
	abstract void sound();
	void eat() {
		System.out.println("Animal eat food ");
	}
	
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("sound of dog");
	}
}
public class AnimalManagement {
	public static void main(String[] args) {
		Animal a=new Dog();
		a.eat();
		a.sound();
		
	}

}
