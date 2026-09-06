package mapCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsByDepartment {

    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();
        
        //map.computeIfAbsent()=> "If Computer is not present, create a new List. Then add Rahul to that List."
//        k -> new ArrayList<>()  =>"If the key doesn't exist, create a new ArrayList."  

        map.computeIfAbsent("Computer", k -> new ArrayList<>()).add("Rahul");///
        map.computeIfAbsent("IT", k -> new ArrayList<>()).add("Amit");
        map.computeIfAbsent("Computer", k -> new ArrayList<>()).add("Priya");
        map.computeIfAbsent("AI", k -> new ArrayList<>()).add("Sneha");
        map.computeIfAbsent("IT", k -> new ArrayList<>()).add("Rohan");

        // Print the result
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            System.out.println(
                entry.getKey() + " → " + entry.getValue()
            );
        }
    }
}
//map.computeIfAbsent(key, k -> value);
//Meaning
//
//It means:
//
//If the key is not present, create and store a value. If the key is already present, use the existing value.
//
//For example:
//
//map.computeIfAbsent("Computer", k -> new ArrayList<>());
//
//Here:
//
//"Computer"              → key
//k -> new ArrayList<>()  → value to create if key is absent