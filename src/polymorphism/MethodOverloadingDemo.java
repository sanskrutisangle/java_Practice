package polymorphism;
class Display{
	void show() {
		System.out.println("no argument");
	}
	void show(int num) {
		System.out.println("Number "+num);
	}
	void show(String str) {
		System.out.println("String "+str);
	}
	void show(int num,String str) {
		System.out.println("Number: " + num + ", Text: " + str);
	}
}

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Display d=new Display();
		d.show();
		d.show(9);
		d.show("sanskruti");
		d.show(88,"sakshi");
	}
	
}
