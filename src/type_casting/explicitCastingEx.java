package type_casting;

public class explicitCastingEx {
	
    public static void main(String[]args) {
    	//Explicit Casting also called as narrowing here we convert large datatype to small datatype 
    	//double-float-long-int-short-byte
    	
    	double mark=70.99;
    	int result =(int)mark;
    	System.out.println(result);
    	
    	double d=89.999999;
    	float f=(float)d;
    	System.out.print(f);
    	
    	int i=65;
    	char c=(char)i;
    	System.out.println(c);
    	
    	long salary=700000000;
    	int amount =(int)salary;
    	System.out.println(amount);
    	
    	//Data Loss During Narrowing    	
    	double num=56.432;
    	int number =(int)num; // decimal part remove 
    	System.out.println(number);
    	
    	//Overflow During Casting     	
    	int n=130;
    	byte b =(byte)n;
    	System.out.println(b);
    	
    	
    	//Decimal Truncation cut the decimal part
    	float s=67.44f;
    	int r=(int)s;
    	System.out.println(r);
    	
    	//Boolean Casting

        //A boolean cannot be converted to any numeric data type, and numeric data types cannot be converted to boolean.
    	
    	//Type Promotion

    	//During arithmetic operations, Java automatically promotes smaller data types (byte, short, and char) to int.
    	    	
    	byte num1=20;
    	byte num2=30;
    	int add=num1+num2;
    	System.out.println(add);
    	
    	
    	
    	
    }
}
