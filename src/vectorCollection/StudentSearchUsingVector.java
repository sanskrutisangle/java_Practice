package vectorCollection;
import java.util.Vector;
import java.util.Scanner;

public class StudentSearchUsingVector {
	public static void main(String[] args) {
		
		Vector<String>students =new Vector<>();
		
		students.add("sanskruti");
		students.add("Rahul");
        students.add("Sneha");
        students.add("Amit");
        students.add("Priya");
        students.add("Neha");
        
        System.out.println("Students: " + students);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        
        if(students.contains(name)) {
        	System.out.println("Student Found");
        } else {
            System.out.println("Student Not Found");
        }

        sc.close();
        }
	}


