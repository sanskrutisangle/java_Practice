package genericDemo;

public class GenericPrinter {
	/*
	public static  <T> void display(T data) //This <T> belongs to the method, not the class.
	{
		System.out.println("data : "+ data);
	}*/
	
	public <T>void display(T a,T b){
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		GenericPrinter obj=new GenericPrinter();
		obj.display(101," sanskruti");
		obj.display("sakshi ",101);
		
	}

}
