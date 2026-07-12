package loopingStatements;
import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		int[] arr =new int[size];
				
		System.out.println("enter number : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();			
		}
		
		int sum =0;	
		
		System.out.println("element of array : ");
		 for(int num:arr) {
			 System.out.println(num);
			 sum=sum+num;
			 }
		 System.out.println("sum :"+sum);
		 sc.close();
	}

}
