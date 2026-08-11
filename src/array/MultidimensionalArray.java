package array;

public class MultidimensionalArray {
	public static void main(String[] args) {
		/*
		int[][][] arr=new int[2][3][4];
		2 blocks
 ↓
3 rows in each block
 ↓
4 columns in each row
*/
		int[][][] arr = {
				{ 
					{2,3,4},
					{2,3,4}
				},
				{
					{3,4,5},
					{3,4,5},
				}
			};
		for (int i = 0; i < arr.length; i++) {

		    for (int j = 0; j < arr[i].length; j++) {

		        for (int k = 0; k < arr[i][j].length; k++) {
		            System.out.print(arr[i][j][k] + " ");
		        }

		        System.out.println();
		    }

		    System.out.println();
		}
	}

}
