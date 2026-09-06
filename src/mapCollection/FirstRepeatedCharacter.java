package mapCollection;
import java.util.*;

public class FirstRepeatedCharacter {
	public static void main(String[] args) {
		String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char ch:str.toCharArray()) {
        	if(map.containsKey(ch)) {
        		System.out.println(ch);
        		break;
        	}
        	map.put(ch,1);
        }
	}

}
