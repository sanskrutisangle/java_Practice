package thisKeyword;
class book{
	String title;
    double price;
    book(String title,double price){
    	this.title=title;
    	this.price=price;
    	new Library(this);// Passing current object to constructor
        }
    void display() {
    	System.out.println("Book Title : " + title);
        System.out.println("Book Price : " + price);

        // Passing current object to method
        showDetails(this);
        
    }
    void showDetails(book b) {
        System.out.println("\nBook Details Received in Method");
        System.out.println("Title : " + b.title);
        System.out.println("Price : " + b.price);
    }
    
}
class Library{
	 Library(book b){
		 System.out.println("Book Details Received in Constructor");
	        System.out.println("Title : " + b.title);
	        System.out.println("Price : " + b.price);
	}
    
}

public class BookMain {
	public static void main(String[] args) {

        book b1 = new book("Java Programming", 499.0);

        System.out.println();
        b1.display();
    }

}
