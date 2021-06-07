package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class create_target_array_in_given_order {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i],nums[i]);
        }
        int[] output = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i]=list.get(i);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        int[] output=createTargetArray(nums,index);
        for (int res : output) {
            System.out.print(res+" ");
        }
    }
}
