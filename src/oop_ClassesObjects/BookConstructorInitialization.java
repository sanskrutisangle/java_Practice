package oop_ClassesObjects;

class book{
	int id ;
	String name ;//object's variables.
	String author;
	int price;
	book(int id,String name,String author,int price){
		this.id=id;//assign each constructor  parameter to the object's variables.
		this.name=name;
		this.author=author;
		this.price=price;	
		//this.Id → instance variable (belongs to the object)
		//Id → constructor parameter
	}
	void display() {
        System.out.println("Book ID : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Author  : " + author);
        System.out.println("Price   : ₹" + price);
    }
	
}
public class BookConstructorInitialization {
	public static void main(String[] args) {
		book b1=new book(01,"java","jemes",600);
		b1.display();
				
		
	}


}
