package mapCollection;

import java.util.HashMap;
import java.util.Map;


public class WordFrequency {
	public static void main(String[] args) {
		String msg="java is easy and java is powerful";
		 HashMap<String, Integer> map = new HashMap<>();
		
		 String[] words = msg.split(" ");

	        for (String word : words) {
	            map.put(word, map.getOrDefault(word, 0) + 1);
	        }
	        
	        System.out.println(map);
	}
	

}
