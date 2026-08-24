package exceptionHandling;

import java.util.Scanner;

public class ArrayIindexException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Enter the index you want to access:");
        int index = sc.nextInt();
        
        try {
        	System.out.println("the element is : "+ arr[index]);
        	
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Invalid index! Please enter an index from 0 to 4.");
        }
		
		
		sc.close();
		
	}

}
