package arrayListDemo;
import java.util.ArrayList;

public class ArrayListUpdateDemo {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		
		names.add("sakshi");
		names.add("samiksha");
		names.add("sanskruti");
		
		names.set(0,"sangale");
		System.out.println(names.get(0));
	}

}
