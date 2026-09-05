package setCollection;
import java.util.TreeSet;


public class SortUniqueElements {
	public static void main(String[] args) {
		int[] arr = {10, 20, 10, 30, 20, 40};
		TreeSet<Integer>set=new TreeSet<>();
		for(int num:arr) {
			set.add(num);
		}
		System.out.println(set);
	}

}
