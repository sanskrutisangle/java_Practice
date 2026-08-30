package studentDataManagementSystem;

public class StudentManagement {
 public static void main(String[] args) {
	// 1. Generic Class with two type parameters
     StudentRecord<Integer, String> s1 =
             new StudentRecord<>(101, "Sanskruti");

     s1.display();

     System.out.println();


     // 2. Generic Interface
     StudentDisplay sd = new StudentDisplay();

     sd.display("Sanskruti");

     System.out.println();
  // 3. Generic Method
     GenericUtility.display(100);
     GenericUtility.display("Java");
     GenericUtility.display(85.5);

     System.out.println();


     // 4. Generic Constructor
     new StudentBox(101);
     new StudentBox("Java");
     new StudentBox(89.5);
	 
}
}
