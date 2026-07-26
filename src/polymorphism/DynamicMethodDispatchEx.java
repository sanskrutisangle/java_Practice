package polymorphism;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatchEx {
	public static void main(String[] args) {
		Animal a;
		a=new Dog();
		a.sound();
		a=new Cat();
		a.sound();

	}
	
}
