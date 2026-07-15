package methods;

public class PassArrayToMethod {
	static int printarray(int[] arr) {
		int sum=0;
		for(int n:arr) {
			System.out.println(n);
			sum+=n;
		}
		return sum;
	
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		printarray(arr);
		System.out.print("sum : "+ printarray(arr));
		
		
	}

}
