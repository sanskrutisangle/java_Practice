package array;

import java.util.Scanner;

public class LargestElement {
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
		
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("largest number : "+largest);
		sc.close();
	}

}
