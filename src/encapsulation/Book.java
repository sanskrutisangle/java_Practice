package encapsulation;

final class BookInfo{
	private final int  bookId;
	private final String bookName;
	BookInfo(int bookId,String bookName){
		this.bookId=bookId;
		this.bookName=bookName;
	}
	public int getbookId() {
		return bookId;
	}
	public String getbookName() {
		return bookName;
	}
}
public class Book {
	public static void main(String[] args) {
		BookInfo obj=new BookInfo(101,"java");
		System.out.println("Book ID : " + obj.getbookId());
        System.out.println("Book Name : " + obj.getbookName());
        System.out.println("\nValues cannot be changed because Book is immutable.");
	}
}
