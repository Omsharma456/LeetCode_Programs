package Array;

import java.util.ArrayList;

public class Decode_XORed_array {
    public static ArrayList<Integer> decodeXOR(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            System.out.println(i-1 +" "+ i);
            list.add(arr[i - 1] * arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(decodeXOR(arr));
    }
}
