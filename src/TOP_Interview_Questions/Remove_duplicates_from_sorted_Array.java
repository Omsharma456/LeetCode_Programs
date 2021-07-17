package TOP_Interview_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_duplicates_from_sorted_Array {
    public static int removeDuplicats(int[] arr) {
        int j=1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(arr));
        return j;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1,3,3,3,4};
        System.out.println(removeDuplicats(arr));
    }
}
