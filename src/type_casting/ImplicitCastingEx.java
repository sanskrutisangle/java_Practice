package type_casting;

public class ImplicitCastingEx {
	public static void main(String[] args) {
		//Implicit Casting also called as widening it convert small datatypes to large datatype 
		
		//byte - short-  int - long - float - double 
		
		byte number =10;
		short s=number;
		System.out.println(s);
		
		int i=s;
		System.out.println(i);
		
		int d=20;
		long l=d;
		System.out.println(l);
		
		long w=6000000;
		float f=w;
		System.out.println(f);
		
		float k=89.90f;
		double e=k;
		System.out.println(e);
				
		int num=20 ;
		double value = num;
		System.out.println(value);	
		
		char q='a';
		int z=q;
		System.out.println(z);
				
		byte a=2;
		byte b=3;
		int  c = a+b;
		System.out.println(c);
		
	}

}
