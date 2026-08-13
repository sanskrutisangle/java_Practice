package Arrays;
import java.util.Arrays;

public class fillArrays {
	public static void main(String[] args) {
		//Used to fill all elements of an array with the same value.
		int[] arr = new int[5];
		Arrays.fill(arr,8);
		System.out.println(Arrays.toString(arr));
	}

}
