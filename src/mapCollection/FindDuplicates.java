package mapCollection;
import java.util.*;

public class FindDuplicates {
	public static void main(String[] args) {
		int[] arr = {10, 20, 10, 30, 20, 40, 50, 10};

        HashMap<Integer, Integer> map = new HashMap<>();
     // Step 1: Count frequency
        
        for(int num:arr) {
        	map.put(num,map.getOrDefault(num, 0)+1);
        }
        
//        map.entrySet()
//        means:
//        Give me all the key-value pairs of the map.
//        Map.Entry<Integer, Integer>
//        means:
//        Map.Entry<KeyType, ValueType>
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){// For every key-value pair (entry) inside map.entrySet(), do something.
        	if(entry.getValue()>1) {
        		System.out.println(entry.getKey());
        	}
        	
//        	entry.getValue() means:
//        		Get the value from the current key-value pair.
        }
	}
}
