package Array;

import java.util.Arrays;

public class Check_if_two_string_arrays_are_equivalent {
    public static boolean checkString(String[] word1, String[] word2) {
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();
        for (int i = 0; i < word1.length; i++) {
            str1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            str2.append(word2[i]);
        }
        return str1.toString().equals(str2.toString());

    }

    public static void main(String[] args) {
        System.out.println(checkString(new String[]{"a", "bc"}, new String[]{"ab", "c"}));
    }
}
