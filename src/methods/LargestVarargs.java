package methods;

public class LargestVarargs {
	static int findLargest(int...numbers) {
		 int largest = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > largest) {
	                largest = numbers[i];
	            }
	        }

	        return largest;
	}
	public static void main(String[] args) {

        int result1 = findLargest(10, 25, 8, 50, 32);
        System.out.println("Largest Number: " + result1);

        int result2 = findLargest(100, 250, 75);
        System.out.println("Largest Number: " + result2);
	}

}
