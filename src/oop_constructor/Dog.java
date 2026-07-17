package oop_constructor;
 class Animal{
	Animal(){
		System.out.println("Animal Constructor");
	}
}
public class Dog extends Animal{
	Dog(){
		 super();   // it tell java "Before executing the Dog constructor, first execute the Animal constructor."
		System.out.println("Dog Constructor");
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		
	}

}
