package arrayListDemo;
import java.util.ArrayList;

public class ElementFrequency {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        ArrayList<Integer> visited = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);

            // Skip if already counted
            if (visited.contains(current)) {
                continue;
            }

            int count = 0;

            // Count frequency
            for (int j = 0; j < numbers.size(); j++) {

                if (numbers.get(j).equals(current)) {
                    count++;
                }
            }

            System.out.println(current + " = " + count);

            // Mark as counted
            visited.add(current);
        }
    }
}