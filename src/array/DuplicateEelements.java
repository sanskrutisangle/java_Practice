package array;

public class DuplicateEelements {
	public static void main(String[] args ) {
		int[] arr = {10, 20, 10, 30, 20};

		for (int i = 0; i < arr.length; i++) {
			boolean duplicate=false;
			
			for(int j=0;j<i;j++) {
				if (arr[i] == arr[j]) {
		            duplicate = true;
		            break;
		        }
			}
			if (!duplicate) {

		        for (int j = i + 1; j < arr.length; j++) {

		            if (arr[i] == arr[j]) {
		                System.out.print(arr[i] + " ");
		                break;
		            }
		        }
		    }
		}
	}

}
