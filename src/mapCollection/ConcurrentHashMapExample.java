package mapCollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(101, "Rahul");
        map.put(102, "Sneha");
        map.put(103, "Amit");

        System.out.println(map);

        System.out.println(map.get(101));

        map.remove(102);

        System.out.println(map);
    }
}