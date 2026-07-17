package oop_constructor;

public class ConstructorOverloadingEx {
	

	    int rollNo;
	    String name;

	    // Default Constructor
	    ConstructorOverloadingEx() {
	        System.out.println("Default Constructor");
	    }

	    // Parameterized Constructor
	    ConstructorOverloadingEx(int rollNo, String name) {
	        this.rollNo = rollNo;
	        this.name = name;
	    }

	    void display() {
	        System.out.println("Roll No : " + rollNo);
	        System.out.println("Name    : " + name);
	    }

	    public static void main(String[] args) {

	    	ConstructorOverloadingEx s1 = new ConstructorOverloadingEx();

	        ConstructorOverloadingEx s2 = new ConstructorOverloadingEx(101, "Sanskruti");

	        s2.display();
	    }
	}


