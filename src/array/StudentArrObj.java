package array;

class Student {
	int roll;
	String name;
	int mark;
	Student(int roll,String name,int mark){
		this.roll=roll;
		this.name=name;
		this.mark=mark;
	}
}
public class StudentArrObj {
	public static void main(String[] args) {
		Student[] stud=new Student[2];
		stud[0]=new Student(1,"sanskruti",90);
		stud[1]=new Student(2,"sakshi",89);
		
		for(int i=0; i< stud.length;i++) {
			System.out.println(stud[i].roll+" "+stud[i].name +" "+ stud[i].mark);
		}
		//highest marks
		//int max=stud[0].mark;
		Student max= stud[0];
		
		for(int i=0;i<stud.length;i++) {
			if(stud[i].mark >max.mark) {
				max.mark=stud[i].mark;
			}
		}
		System.out.println("Highest Marks:");
		System.out.println(max.name + " " + max.mark);
		
		//average marks
		int sum=0;
		
		for(int i = 0; i < stud.length; i++) {
			sum+=stud[i].mark;
		}
		double avg=(double)sum/stud.length;
		System.out.println("Average = " + avg);
		
		
	}

}
