package Easy;

public class Longest_contiguous_segments_of_ones_that_zero {
    public static void checkZeroOnes(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count1=1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count1++;
                } else {
                    i=j;
                    System.out.println(s.charAt(i));
                    break;
                }
            }
            System.out.println(count1);
        }
    }

    public static void main(String[] args) {
        checkZeroOnes("11001");
    }
}
