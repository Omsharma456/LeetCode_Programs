package Array;

import java.util.HashMap;
import java.util.Map;

public class Count_the_number_of_consistent_string {
    public static int consString(String allowed, String[] s) {
        int[] arr = new int[256];
        for (int i = 0; i < allowed.length(); i++) {
            int ascii = (char) allowed.charAt(i);
            arr[ascii]=1;
        }
        int count=0;
        for (int i = 0; i < s.length; i++) {
            int flag=1;
            for (int j = 0; j < s[i].length(); j++) {
                int asciiChar = (char) s[i].charAt(j);
                if (arr[asciiChar] == 0) {
                    flag=0;
                    break;
                }
            }
            if (flag == 1) {
                count++;
            }
        }
        return count;

    }

//    public static int countConsistentStrings(String allowed, String[] words) {
//        int count=0;
//        for (String str : words) {
//            for (char c : str.toCharArray()) {
//                if (allowed.indexOf(c) == -1) {
//                    count--;
//                    break;
//                }
//            }
//            count++;
//        }
//        return count;
//    }
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        System.out.println(consString("abc",arr));
    }
}
