package setCollection;
import java.util.LinkedHashSet;

public class RemoveDuplicatesOrder {
	public static void main(String[] args) {
		int[] arr = {10, 20, 10, 30, 20, 40};
		LinkedHashSet<Integer>set=new LinkedHashSet<>();
		for(int num:arr) {
			set.add(num);
		}
		System.out.println(set);
		
	}

}
