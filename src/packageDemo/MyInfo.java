package packageDemo;


public class MyInfo {
	int marks = 90;//if we put the mark in main then Its scope is only inside that main() method. 
	private int mark = 90;
	protected int age=20;
	public void display() {
		System.out.println("my name is sanskruti");
		System.out.println("my age is 20");
	}
	public static void main(String[] args) {
		
		MyInfo obj=new MyInfo();//object does not become available automatically in another package.
		obj.display();
	}

}
