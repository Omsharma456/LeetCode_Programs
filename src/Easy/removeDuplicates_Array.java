package Easy;

import java.util.Arrays;

public class removeDuplicates_Array {
    public static int removeDuplicates(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] == array[j]) {
                    array[j]=-1;
                }
            }
        }
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                count+=1;
                System.out.print(array[i]+" ");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
