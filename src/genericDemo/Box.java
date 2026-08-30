package genericDemo;

public class Box {
	<T>Box(T a){
		System.out.println(a);
		System.out.println("Type : "+a.getClass().getSimpleName());
	}
	
	/*
	  getClass() → gets the class/type of the object.
	getSimpleName() → gets the simple name of that class as a String.*/
	 
	public static void main(String[] args) {
		Box b=new Box(1);
		Box b1=new Box("sanskruti");
	}

}
