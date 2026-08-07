package encapsulation;
import java.util.Scanner;
class StudentDetails{
	private int id;
    private String name;
    private int age;
    private double mark;
    
    public StudentDetails(int id, String name, int age, double mark) {
        this.id = id;
        setName(name);//Only call methods that are needed while creating the object.
        setAge(age);
        setMark(mark);
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return mark;
    }
    
    public void setName(String name) {
    	if(name!=null && !name.trim().isEmpty()) {
    		this.name=name;
    	}else {
    		System.out.println("Invalid Name! Name cannot be empty.");
    	}
    }
    
    public void setAge(int age) {
    	if(age>=18 && age<=30) {
    		this.age=age;
    	}else {
    		 System.out.println("Invalid Age! Age must be between 18 and 30.");
    	}
    }
    public void setMark(double mark) {
    	if(mark>=0 && mark<=100) {
    		this.mark=mark;
    	}else {
    		System.out.println("Invalid Marks! Marks must be between 0 and 100.");
    	}
    }
    public void display() {
        System.out.println("\n----- Student Details -----");
        System.out.println("ID    : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + mark);
    }
}
public class StudentManagementSystem {
	public static void main(String[] args) {
		
		StudentDetails student =null;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Display Student");
            System.out.println("4. Exit");
            
            System.out.print("Enter Choice: ");
            int choice=sc.nextInt();
            
            switch(choice) {
            case 1 :
            	System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Marks: ");
                double mark = sc.nextDouble();
                
                student =new StudentDetails(id,name,age,mark);
                System.out.println("Student Added Successfully.");
                break;
            case 2 : 
            	
            	 if (student == null) {
                     System.out.println("No student available.");
                     break;
                     
                 }
            	 sc.nextLine();
            	 
            	 System.out.print("Enter New Name: ");
            	 student.setName(sc.nextLine());
            	 System.out.print("Enter New Age: ");
            	 student.setAge(sc.nextInt());
            	 System.out.print("Enter New Marks: ");
            	 student.setMark(sc.nextInt());
            	 System.out.println("Student Updated Successfully.");
                 break;
            case 3 : 
            	if (student == null) {
                    System.out.println("No student available.");
                } else {
                    student.display();
                }

                break;
            case 4:

                System.out.println("Thank You!");
                sc.close();
                System.exit(0);//is used to terminate (stop) the entire Java program immediately.s

            default:

                System.out.println("Invalid Choice.");
            }
		}
	}

}
