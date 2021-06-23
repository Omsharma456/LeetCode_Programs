package Array;

import java.util.Arrays;

public class find_the_highest_altitude1 {
    public static int largestAltitude(int[] gain){
        int start=0;
        for (int i = 1; i < gain.length;  i++) {
            int j=i-1;
            if (j<gain.length) {
                gain[i]=gain[i]+gain[j];
            }
        }
        for (int i = 0; i < gain.length; i++) {
            if (start < gain[i]) {
                start=gain[i];
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }
}
