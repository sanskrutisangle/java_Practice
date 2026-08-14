package array;

public class Larges2D {
	public static void main(String[] args) {
		int[][]arr= {
				{ 12,23,45},
				{34,89,90}
		};
		int max=arr[0][0];
		for (int i = 0; i < arr.length; i++) {

		    for (int j = 0; j < arr[i].length; j++) {

		        if (arr[i][j] > max) {
		            max = arr[i][j];
		        }
		    }
		}

		System.out.println("Larges number is : "+max);
	}

}
