package arrayListDemo;
import java.util.ArrayList;

public class CommonElements {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> common = new ArrayList<>();
        
        // List 1
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        // List 2
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        
        for (int i = 0; i < list1.size(); i++) {
        	
        	int element =list1.get(i);
        	if(list2.contains(element)) {
        		common.add(element);
        	}
        }
        
        System.out.println(common);
	}

}
