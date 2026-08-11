package array;
import java.util.Scanner;
public class JaggedArray {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter number of rows: ");
		 int rows = sc.nextInt();

		 int[][] arr = new int[rows][];

		 for (int i = 0; i < rows; i++) {

		     System.out.print("Enter columns for row " + i + ": ");
		     int cols = sc.nextInt();

		     arr[i] = new int[cols];

		     System.out.println("Enter elements:");

		     for (int j = 0; j < cols; j++) {
		         arr[i][j] = sc.nextInt();
		     }
		 }

		 System.out.println("Jagged Array:");

		 for (int i = 0; i < arr.length; i++) {

		     for (int j = 0; j < arr[i].length; j++) {
		         System.out.print(arr[i][j] + " ");
		     }

		     System.out.println();
		 }
		
		 for(int i=0;i<arr.length;i++) {
			 int sum=0;//it gets reset for every row.
			 for(int j=0;j<arr[i].length;j++) {
				 sum+=arr[i][j];
			 }
			 System.out.println("sum "+ sum +" row "+ i);
		 }
		 //System.out.println(sum);
		 sc.close();
	 }

}
