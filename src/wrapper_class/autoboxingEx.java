package wrapper_class;

public class autoboxingEx {
	public static void main(String[] args) {
		//Using valueOf()
		Integer num1 =Integer.valueOf(100);
		System.out.println(num1);
				
		Integer num2 =Integer.valueOf(100);
		System.out.println(num2);
		
		 Integer add= Integer.valueOf(num1+num2);		 
		 System.out.println(add);
		 
		 //Using Autoboxing
		 Integer num3 =300; //java automatically convert it into Integer num3= Integer.valueOf(300);
		 System.out.println(num3);
		 //this is called autoboxing 
		 
		 //using Constructor
		 
		 //Integer num4= new Integer(300);  // Deprecated
		 //System.out.println(num4);
		 
		 Byte b=10; //Autoboxing works because 80 fits in byte range
		 //Byte b1=Byte.valueOf(80); //this give an error because It expects a byte value. to remove error we have to convert this into byte 80 now it treated as int by java 
		 Byte b1 =Byte.valueOf((byte)80);
		 
		 
		 Short s =90;
		 //Short s1 =Short.valueOf(90);
		 Short s1=Short.valueOf((short)90);
		 System.out.println(s1);
		 
		 //for remove this error we also can pass string 
		 Short s2= Short.valueOf("80");
		 System.out.println(s2);
		 
		 
		
		
		 
		 
		 
		 
		 
	}

}
