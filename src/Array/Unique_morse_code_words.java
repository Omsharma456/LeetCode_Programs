package Array;

import java.util.HashSet;
import java.util.Set;

public class Unique_morse_code_words {
    public static int encode(String[] words) {
        String[] code = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(code[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] arr = {"gin", "zen", "gig", "msg"};
        System.out.println(encode(arr));
    }
}
