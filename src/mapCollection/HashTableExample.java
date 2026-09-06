package mapCollection;
import java.util.Hashtable;

public class HashTableExample {
	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<>();

        // Add data
        table.put(101, "Rahul");
        table.put(102, "Sneha");
        table.put(103, "Amit");

        // Print
        System.out.println(table);

        // Get value
        System.out.println(table.get(101));

        // Remove
        table.remove(102);

        // Check key
        System.out.println(table.containsKey(103));

        // Size
        System.out.println(table.size());
	}

}
