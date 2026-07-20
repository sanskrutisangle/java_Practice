package thisKeyword;
import java.util.*;

public class StudentMain  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id :");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the name :");
		String name=sc.nextLine();
		
		System.out.println("Enter the mark :");
		double mark=sc.nextDouble();
		
		
		Student s=new Student(id, name,mark);
		
		s.display();
		System.out.println("Enter the new mark :");
		double newMark=sc.nextDouble();
		
		s.updateMarks(newMark);
		
		System.out.println("After updating mark :");
		s.display();
		
		sc.close();
		
	}
}
