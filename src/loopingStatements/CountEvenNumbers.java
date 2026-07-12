package loopingStatements;

public class CountEvenNumbers {
	public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30, 35};
        int count =0;
        for(int num:arr) {
        	if(num%2==0) {
        		System.out.println(num);
        		count++;
        	}
        }
        System.out.println("Number of Even Element:"+ count);
	}
}
