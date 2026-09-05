package setCollection;
import java.util.HashSet;

public class FindDuplicates {
	public static void main(String[] args) {
		 int[] arr = {10, 20, 30, 20, 40, 10, 50};
		 HashSet<Integer>set=new HashSet<>();
		 
		 for(int num:arr) {
			 if(set.contains(num)) {
				 System.out.println(num);
			 }else {
				 set.add(num);
			 }
			 
		 }
		 
	}

}
