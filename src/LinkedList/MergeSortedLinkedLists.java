package LinkedList;

import java.util.LinkedList;

public class MergeSortedLinkedLists {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(30);
        list1.add(50);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(20);
        list2.add(40);
        list2.add(60);

        LinkedList<Integer> result = new LinkedList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {

            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        // Add remaining elements of list1
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        // Add remaining elements of list2
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        System.out.println(result);
    }
}