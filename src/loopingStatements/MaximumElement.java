package loopingStatements;

public class MaximumElement {
	public static void main(String[] args) {
		int[] mark= {67,90,76,89,90,93,84};
		int max=mark[0];
		System.out.println("Student mark :");
		for(int num:mark) {
			System.out.println(num);
			if(num>max) {
				max=num;
			}
		}
		System.out.println("maxinum mark :"+max);
	}

}
