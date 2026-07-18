package object_typecasting;
class shape{
	
}
class Circle extends shape{
	
}
class Rectangle extends shape{
	
}

public class instanceofwithmultiplechild {
	public static void main(String[] args) {
		shape s1=new Circle();
		shape s2=new Rectangle();
		System.out.println("Is s1 a Circle? " + (s1 instanceof Circle));
        System.out.println("Is s1 a Rectangle? " + (s1 instanceof Rectangle));
        System.out.println("Is s2 a Rectangle? " + (s2 instanceof Rectangle));
        System.out.println("Is s2 a Circle? " + (s2 instanceof Circle));

		
	}

}
