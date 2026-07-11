package wrapper_class;

public class methodsOfWrapper {
	public static void main(String[] args) {
		//Methods of Wrapper Classes
		
		//valueOf() -use to convert primitive to wrapper object
		Character ch=Character.valueOf('A');
		System.out.println(ch);
		
		//parsexxx() -convert string to primitive  
		String s ="123";
		int i =Integer.parseInt(s);
		System.out.println(i);
		
		String s1="1234.89";
		float f=Float.parseFloat(s1);
		System.out.println(f);
		
		String s2="56.8888";
		double d=Double.parseDouble(s2);
		System.out.println(d);
		
		String s3 ="2345678";
		long l=Long.parseLong(s3);
		System.out.println(l);
		
		//xxxvalue() -convert wrapper object to primitive 
		
		Integer i1=Integer.valueOf(56);
		int i2=i1.intValue();
		System.out.println(i2);
		
		Float f1=Float.valueOf(89.98f);
		float f2=f1.floatValue();
		System.out.println(f2);
		
		Character  ch1=Character.valueOf('c');
		char ch2=ch1.charValue();
		System.out.println(ch2);
		
		
		//tostring() - convert primitive or wrapper to string 
		Integer i3=90;
		String s4=i3.toString();//String s=Integer.toString(99);
		System.out.println(s4);
		
		Float f3=89.90f;
		String s5=f3.toString();//String s=Float.toString(45.50f);
		System.out.println(s5);
		
		//compareTo() -use to compare two wrapper object , it is instance method work with object 
		Integer num1=90;
		Integer num2=90;
		System.out.println(num1.compareTo(num2));
		//Negative → first is smaller
		//Zero → equal
		//Positive → first is greater
		
		//compare() -- static method work with wrapper class 
		System.out.println(Integer.compare(56,67));
		System.out.println(Integer.compare(90,34));
		
		//equals() -- check if it is equals or not 
		Integer no1=88;
		Integer no2=11;
		System.out.println(no1.equals(no2));
		
		//hashCode() - return has value 
		Integer no3=900;
		System.out.println(no3.hashCode());
		
		// MAX_VALUE and MIN_VALUE
		//These are constants fields not methods. 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
