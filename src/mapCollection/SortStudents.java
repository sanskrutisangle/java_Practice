package mapCollection;

import java.util.TreeMap;
import java.util.Map;

public class SortStudents {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding students in random order
        map.put(105, "A");
        map.put(101, "B");
        map.put(103, "C");
        map.put(102, "D");

        // Display students
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}