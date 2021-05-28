package Easy;

import java.util.ArrayList;

public class Decompress_Run_length_encoded_list {
    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int j=1;
        for (int i = 0; i < nums.length; i += 2) {
            for (int k = 0; k < nums[i]; k++) {
                list.add(nums[j]);
            }
            j+=2;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
    }
}
