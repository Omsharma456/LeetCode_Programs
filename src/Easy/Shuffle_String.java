package Easy;

import java.util.Arrays;

public class Shuffle_String {
    public static String restoreString(String s, int[] indices) {
        char[] array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[indices[i]] = s.charAt(i);
        }

        return new String(array);
    }

    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
}
