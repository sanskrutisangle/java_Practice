package array;

public class ArrayDefaultValue {
	public static void main(String[] args) {
		int[] arr=new int[5];
		
        // Default values
        System.out.println("Default values:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

		arr[2]=89;
		 System.out.println("After updating:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("element od 2nd : "+arr[2]);
		
		}

}
