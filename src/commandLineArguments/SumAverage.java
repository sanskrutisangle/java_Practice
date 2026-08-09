package commandLineArguments;

public class SumAverage {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0;i<args.length;i++) {
			int number=Integer.parseInt(args[i]);
			sum+=number;
					 
		}
		double average = (double)sum/args.length;
		System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
	}

}
