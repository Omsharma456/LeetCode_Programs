package Easy;

import java.util.Arrays;

public class Numbers_are_smaller_than_current_number {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] storeArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]>nums[j] && j!=i){
                    count++;
                }
                storeArray[i]=count;
            }
        }
        return storeArray;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 2, 8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(array)));
    }
}
