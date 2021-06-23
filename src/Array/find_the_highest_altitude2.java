package Array;

public class find_the_highest_altitude2 {
    public static int largestAltitude(int[] gain) {
        int start=0;
        int curr=0;
        for (int res : gain) {
            curr+=res;
            if (curr > start) {
                start=curr;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
}
