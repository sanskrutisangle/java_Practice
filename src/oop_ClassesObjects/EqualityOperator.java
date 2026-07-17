package oop_ClassesObjects;

class studentEx{
	int a=17;
	int b=17;
}
public class EqualityOperator {
	public static void main(String[] args) {
		studentEx s1=new studentEx();
		studentEx s2=new studentEx();
		System.out.println(s1==s2);// for non primitive datatype it check memory address
		System.out.println(s1.a==s1.b);//for primitive datatype it check content or value 
		s1=s2;
		System.out.println(s1==s2);
	}

}
