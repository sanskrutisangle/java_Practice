package methods;

public class AverageVarargs {
	static double average(int... num) {
		int sum=0;
		for(int n:num) {
			sum+=n;
		}
		double avg=sum/(double)num.length;
		return avg;
		
	}
	public static void main(String[] args) {

        System.out.println(average(10, 20, 30, 40));
        System.out.println(average(5, 10, 15));
        System.out.println(average(100, 200));
    }

}
