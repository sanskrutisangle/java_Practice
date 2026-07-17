package oop_constructor;

public class course {
	String name;
	int price;
	course(){
		this("java",900);
	}
	course(String name,int price){
		this.name=name;
		this.price=price;
	}
	void display() {
		System.out.println("name of the course : "+name);
		System.out.println("price : "+price);
		
	}
	public static void main(String[] args) {
		course s=new course();
		s.display();
	}
	

}
