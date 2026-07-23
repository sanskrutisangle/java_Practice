package inherits;
class Animal{
	Animal(String name){
		System.out.println("String "+name);
	}
}
class Dog extends Animal{
	Dog(){
		super("Tommy");
		System.out.println("Dog constructor");
	}
}
public class Animalmain {
	public static void main(String[] args) {
		Dog d=new Dog();
	}

}
