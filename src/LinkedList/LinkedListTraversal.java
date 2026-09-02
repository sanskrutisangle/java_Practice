package LinkedList;
import java.util.LinkedList;
public class LinkedListTraversal {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		for(Integer e : list) {
			System.out.println(e);
		}
	}

}
