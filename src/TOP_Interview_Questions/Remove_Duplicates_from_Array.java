package TOP_Interview_Questions;

import java.util.ArrayList;
import java.util.LinkedList;

public class Remove_Duplicates_from_Array {
    public static void removeDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i]=-1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                System.out.print(array[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 2, 31, 2, 4, 3, 5});
    }
}
