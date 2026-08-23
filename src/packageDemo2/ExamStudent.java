package packageDemo2;
import packageDemo1.StudentRecord;

public class ExamStudent extends  StudentRecord{
	
	public void displaymark() {
		System.out.println(mark);
		System.out.println(this.mark);
		
		ExamStudent obj1 =new ExamStudent();
				System.out.println(obj1.mark);
				//So ExamStudent inherits the protected variable:
				//Therefore, obj1 is an ExamStudent object, and it has access to the inherited mark.
				
				StudentRecord obj2=new StudentRecord();
				//System.out.println(obj2.mark);.is not visible 
				//When a subclass is in a different package, protected allows access through the subclass/inheritance, not through an ordinary parent-class object.
	}
}
