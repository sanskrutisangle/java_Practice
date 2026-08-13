package array;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr;
		
		System.out.println("Enter the size of your array : ");
		int size=sc.nextInt();
		
		arr=new int[size];
		
		System.out.println("enter the elements of arrat");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		
		System.out.println("second Largest : "+ secondLargest);
		sc.close();
	}

}
