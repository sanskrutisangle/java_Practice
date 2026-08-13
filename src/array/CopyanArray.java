package array;
import java.util.Arrays;

public class CopyanArray {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		//int[] copy=Arrays.copyOf(arr,arr.length);
		int[] copy=Arrays.copyOf(arr,10);//new array with a specified size
		System.out.println(Arrays.toString(copy));
	}

}
