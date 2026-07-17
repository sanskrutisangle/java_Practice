package oop_constructor;
class courseEx{
	courseEx(String name){
		System.out.println("course name "+ name);
	}
}
public class chainingEx extends courseEx {
	chainingEx(){
		super("java");
		System.out.println("the chaining class constructor ....");
		
	}
	public static void main(String[] args) {
		chainingEx c=new chainingEx();
		
	}

}
