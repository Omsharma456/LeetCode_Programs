package Easy;

import java.util.Arrays;

public class merge_two_sorted_lists {
    public static void mergelist(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] mergeArray = new int[arr1.length + arr2.length];
        for (int i = 0, j = arr1.length; i < arr1.length && j < mergeArray.length; i++, j++) {
            mergeArray[i] = arr1[i];
            mergeArray[j] = arr2[i];
        }
        Arrays.sort(mergeArray);
        System.out.print("[");
        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(i!=mergeArray.length-1 ?mergeArray[i]+",":mergeArray[i]);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int[] arr2 = {3,4,5};
        mergelist(arr,arr2);
    }
}
