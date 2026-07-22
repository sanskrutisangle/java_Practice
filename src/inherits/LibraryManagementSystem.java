package inherits;
class Book{
	protected String title;
	protected String author;
	public Book(String title,String author){
		this.title=title;
		this.author=author;
	}
	public void Display(){
		System.out.println("Title :"+title);
		System.out.println("Author :"+title);
	}
}
class TextBook extends Book{
	public TextBook(String title,String author){
		super( title, author);
	}
	public void showSubject(String subject) {
        System.out.println("Subject : " + subject);
    }
	
}
class  Novel extends Book{
	public Novel(String title,String author) {
		super( title, author);
	}
	public void showGenre(String genre) {
        System.out.println("Genre : " + genre);
    }
}
class  Magazine extends Book{
	public Magazine(String title,String author) {
		super( title, author);
	}
	public void showIssueNumber(int issueNo) {
        System.out.println("Issue Number : " + issueNo);
    }
}
public class LibraryManagementSystem {
	public static void main(String[] args) {
		TextBook tb=new TextBook(
				"Java Programming",
                "Herbert Schildt"
				);
		Novel n=new Novel(
				"The Alchemist",
                "Paulo Coelho"
				);
		Magazine m=new Magazine(
				"National Geographic",
                "National Geographic Society"
				);
		System.out.println("----- TextBook -----");		
		tb.Display();
        tb.showSubject("Computer Science");
        
        System.out.println("----- Novel -----");
        n.Display();
        n.showGenre("Fiction");
        
        System.out.println("----- Magazine -----");
        m.Display();
        m.showIssueNumber(25);
        
	}
}


