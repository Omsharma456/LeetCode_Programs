package TOP_Interview_Questions;

import java.util.Comparator;
import java.util.LinkedList;

public class Merge_two_sorted_lists {
    public static void mergeList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> listmerge = new LinkedList<>();
        for (int i = 0; i < list1.size(); i++) {
            listmerge.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            listmerge.add(list2.get(i));
        }
        
        System.out.println(listmerge);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        LinkedList<Integer> list1 = new LinkedList<>();
        list.add(1);
        list.add(2);
        mergeList(list, list1);
    }
}
