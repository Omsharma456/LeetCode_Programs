package Leetcode_Contests;

public class find_the_Student_that_will_replace_the_chalk {
    public static int student(int[] arr, int k){
        int index=0;
        while (true){
            for (int i=0; i<arr.length; i++){
                if (k - arr[i] >= 0) {
                    k -= arr[i];
                } else {
                    index=i+1;
                    break;
                }
            }
            return index;
        }
    }

    public static void main(String[] args) {
        System.out.println(student(new int[]{3,4,1,2},25));
    }
}
