package mapCollection;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequency {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10, 40, 20, 20};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find highest frequency
        int highestFrequency = 0;
        int highestElement = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > highestFrequency) {

                highestFrequency = entry.getValue();
                highestElement = entry.getKey();
            }
        }

        System.out.println(
            highestElement + " → " + highestFrequency + " times"
        );
    }
}