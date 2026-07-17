package oop_constructor;

public class CopyConstructor {
	

	    int rollNo;
	    String name;

	    CopyConstructor(int rollNo, String name) {
	        this.rollNo = rollNo;
	        this.name = name;
	    
	    }
	    CopyConstructor(CopyConstructor cp){
	    	this.rollNo = cp.rollNo;
	        this.name = cp.name;
	    }
	    void display() {
	        System.out.println("Roll No : " + rollNo);
	        System.out.println("Name    : " + name);
	    }
	    public static void main(String[] args) {
	    	CopyConstructor cp=new CopyConstructor(12,"sanskruti");
	    	CopyConstructor cp1=new CopyConstructor(cp);
	    	cp1.display();
	    	
	    }

}
