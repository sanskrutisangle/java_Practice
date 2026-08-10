package array;

public class CommandArray {
	public static void main(String[] args) {
		int[] arr=new int[args.length];
		for(int i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		System.out.println("Using for loop:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Using for-each:");

        for (int value : arr) {
            System.out.println(value);
        }
	}

}
