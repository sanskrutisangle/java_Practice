package basics;

public class instanceVariable {
	String name;//instance variable = declare outside all the  methods but inside the class and each object has its own copy  
	
	public static void main(String[] args) {
		
		instanceVariable obj=new instanceVariable();
		
		obj.name="sanskruti";
		System.out.println(obj.name);
		
	}

}
