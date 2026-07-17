package methods;

public class SecondLargest {
	static int findSecondLargest(int[] arr) {
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		for(int n:arr) {
			if(n>largest) {
				secondlargest=largest;
				largest=n;
			}else if(n>secondlargest && n!=largest) {
				secondlargest=n;
			}
		}
		return secondlargest;
	}
	public static void main(String[] args) {

        int[] arr = {10, 50, 20, 80, 40, 70};

        System.out.println("Second Largest = " + findSecondLargest(arr));
    }

}
