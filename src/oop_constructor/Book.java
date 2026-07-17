package oop_constructor;

public class Book {
	
	Book(){
		this("java programming");//t tells Java: "Call another constructor of this same class that accepts one String parameter."
	}
	Book(String title){
		System.out.println("the titile of book is :"+title);//automatically passes the value:
		
	}
	
	public static void main(String[] args) {
		Book b=new Book();
		
	
	}

}
