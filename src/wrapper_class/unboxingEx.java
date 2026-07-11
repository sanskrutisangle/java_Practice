package wrapper_class;

public class unboxingEx {
	public static void main(String[] args) {
		 
		//method 1 
		Integer i=Integer.valueOf(90);//manual
		System.out.println(i);
		
		//method 2
		Integer x=80;//autoboxing 
		System.out.println(x);
		
		
		//Unboxing means converting wrapper object into primitive 
		
		//method 1 
		int x1 =x; //java done it automatically
		System.out.println(x1);
		
		//method 2
		int i1 =i.intValue();//Manual Unboxing
		System.out.println(i1);
		
		
		Boolean b=true;//autoboxing
		
		boolean b1=b;//unboxing 
		System.out.println(b1);
		
		boolean b2=b.booleanValue();//manual unboxing 
		System.out.println(b2);
		
		Character ch='A';
		char ch1=ch.charValue();
		System.out.println(ch1);
		
		Short s = Short.valueOf((short)90);
		short s1=s.shortValue();
		System.out.println(s1);
		
		
		
		
	}

}
