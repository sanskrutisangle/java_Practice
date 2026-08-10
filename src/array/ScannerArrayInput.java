package array;
import java.util.Scanner;

public class ScannerArrayInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter array elements:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		 System.out.println("Using for loop:"); 
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 
		 System.out.println("Using for-each loop:");
		 
		 for(int value : arr) {
			 System.out.println(value);
		 }
		sc.close();
	}

}
