package mapCollection;

import java.util.HashMap;

public class ElementFrequency {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 1, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);//If the key exists, give me its value. If it doesn't exist, give me the default value."
        }

        System.out.println(map);
    }
}