package loopingStatements;

public class AverageOfArrayElements {
	public static void main(String[] args) {
		int[] mark= {67,90,76,89,90,93,84};
		int sum=0;
		System.out.println("Students mark : ");
		for(int i:mark) {
			System.out.println(i);
			sum+=i;
		}
		
		double average =(double)sum/mark.length;
		System.out.printf("Average of mark : %.2f",average );
		
	}

}
