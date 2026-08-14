package array;

public class TransposeMatrix {
	public static void main(String[] args) {
		int[][] arr = {
				{23,45,78},
				{90,43}
		};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+"");
			}
			System.out.println();
		}
		for(int j=0;j<arr[0].length;j++) {
			
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i][j]+"");
			}
			System.out.print("");
		}
		
	}
}
