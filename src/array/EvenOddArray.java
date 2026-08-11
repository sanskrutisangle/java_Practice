package array;

import java.util.Scanner;

public class EvenOddArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter size: ");
	        int size = sc.nextInt();

	        int[] arr = new int[size];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        int[] even = new int[size];
	        int[] odd = new int[size];

	        int evenIndex = 0;
	        int oddIndex = 0;
	        
	        for(int i=0;i<arr.length;i++) {
	        	if(arr[i]%2==0) {
	        			even[evenIndex]=arr[i];
	        			evenIndex++;
	        	}else {
	        		odd[oddIndex]=arr[i];
	        		oddIndex++;
	        	}
	        }
	        System.out.println("Even numbers:");

	        for (int i = 0; i < evenIndex; i++) {
	            System.out.print(even[i] + " ");
	        }

	        // Print odd numbers
	        System.out.println("\nOdd numbers:");

	        for (int i = 0; i < oddIndex; i++) {
	            System.out.print(odd[i] + " ");
	        }

		sc.close();
		
	}

}
