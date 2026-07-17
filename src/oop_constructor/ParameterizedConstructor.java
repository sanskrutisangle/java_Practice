package oop_constructor;

public class ParameterizedConstructor {
	

	    int rollNo;
	    String name;

	    ParameterizedConstructor(int rollNo, String name) {
	        this.rollNo = rollNo;
	        this.name = name;
	    }

	    void display() {
	        System.out.println("Roll No : " + rollNo);
	        System.out.println("Name    : " + name);
	    }

	    public static void main(String[] args) {
	    	ParameterizedConstructor s1 = new ParameterizedConstructor(101, "Sanskruti");
	        s1.display();
	    }
	

}
