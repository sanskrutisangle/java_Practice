package array;

public class SumMainDiagonal {
	public static void main(String[] args) {
		int[][] arr = {
			    {10, 20, 30},
			    {40, 50, 60},
			    {70, 80, 90}
			};

			int sum = 0;

			for (int i = 0; i < arr.length; i++) {
			    sum += arr[i][i];//row number and column number are the same.
			}

			System.out.println("Diagonal sum = " + sum);
	}

}
