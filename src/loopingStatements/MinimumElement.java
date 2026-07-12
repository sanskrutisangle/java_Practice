package loopingStatements;

public class MinimumElement {
	public static void main(String[] args) {
		int[] mark= {67,90,76,89,90,93,84};
		int min=mark[0];
		System.out.println("Student mark :");
		for(int i : mark) {
			System.out.println(i);
			if(i<min) {
				min=i;
			}
		}
		System.out.println("Minimum mark :"+min);
	}
}
