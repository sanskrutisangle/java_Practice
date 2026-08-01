package multipleInheritanc;
interface Teaching{
	void startClass();
	void endClass();
}
interface Evaluation{
	void checkAssignment();
	void giveMarks();
}
class Teacher implements Teaching , Evaluation {
	String Teacher =" Rahul Sharma";
	String Subject =" Java";

	@Override 
	public void startClass() {
		System.out.println("class is started.........");
		}
	@Override 
	public void endClass() {
		System.out.println("class is end........");
		}
	@Override 
	public void checkAssignment() {
		System.out.println("now check assignment.........");
		}
	@Override 
	public void giveMarks(){
		System.out.println("mark is given.........");
		}
	
}
public class OnlineLearningPlatform {
	public static void main(String[] args) {
		Teacher obj=new Teacher();
		System.out.println("teacher name : "+obj.Teacher);
		System.out.println("subject : "+obj.Subject);
		obj.startClass();
		obj.endClass();
		obj.checkAssignment();
		obj.giveMarks();
		}

}
