package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Maximum_product_difference_between_pairs {
    public static int maxDiff(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int lenarr = array.length;
        int maxdiff = (array[lenarr - 1] * array[lenarr - 2]) - (array[0] * array[1]);
        return maxdiff;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 7, 8,3,5,6,4};
        System.out.println(maxDiff(arr));
    }
}
