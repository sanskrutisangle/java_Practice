package array;

import java.util.Scanner;

public class ArrayIndexCheck {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int[] arr=new int[] {1,2,3,4,5,6};
		 
		 System.out.print("Enter index: ");
		 int index=sc.nextInt();
		 
		 if(index>=0&& index < arr.length) {
			 System.out.println("element : "+arr[index]);
		 }else {
			 System.out.println("Invalid index");
		 }
		 sc.close();
	}

}
