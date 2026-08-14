package array;

public class SumJaggedArray {
	public static void main(String[] args) {
		int[][] arr = {
				{23,45,78},
				{90,43}
		};
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			System.out.println("Row " + i + " sum = " + sum);
		}
		
	}

}
