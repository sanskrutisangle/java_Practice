package oop_ClassesObjects;
abstract class Shape{
	abstract void draw();
}
public class AnonymousInnerClass {
	public static void main(String[] args) {
		Shape s=new Shape() {
			@Override
            void draw() {
                System.out.println("Drawing Circle");
            }
		};
		s.draw();
	}

}
