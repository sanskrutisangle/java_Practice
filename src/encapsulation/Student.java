package encapsulation;
class StudentInfo{
	private int rollno;
	private String name ;
	
	public void setrollno(int rollno) {
		this.rollno=rollno;
		}
	public void setname(String name) {
		this.name=name;
	}
	public int getrollno() {
		return rollno;
	}
	public String getname() {
		return name;
	}
}
public class Student {
	public static void main(String[] args) {
		StudentInfo s=new StudentInfo();
		s.setrollno(1);
		s.setname("sanskruti");
		System.out.println(s.getrollno());
		System.out.println(s.getname());
		
	}

}
