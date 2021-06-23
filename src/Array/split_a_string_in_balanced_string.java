package Array;

public class split_a_string_in_balanced_string {
    public static int balancedString(String s) {
        int counterL = 0, counterR = 0, counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') counterL++;
            else counterR++;
            if (counterL == counterR)  counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(balancedString("RLLLLRRRLR"));
    }
}
