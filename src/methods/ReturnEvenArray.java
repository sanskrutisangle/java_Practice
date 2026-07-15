package methods;


public class ReturnEvenArray {

    // Method to return an array of even numbers
    static int[] getEvenNumbers(int[] arr) {

        // Count even numbers
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // Create array of required size
        int[] even = new int[count];

        // Store even numbers
        int index = 0;//index tells us where to store the next even number in the even array.
        for (int num : arr) {
            if (num % 2 == 0) {
                even[index] = num;
                index++;
            }
        }

        return even;
    }

    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30, 35, 40};

        int[] result = getEvenNumbers(arr);

        System.out.print("Even Numbers: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}