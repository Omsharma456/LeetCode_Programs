package Leetcode_Contests;

public class Check_if_word_equals_Summation_of_two_words {
    public static boolean wordCheck(String first, String second, String target) {
        int firstval=0;
        int secondval=0;
        int targetVal=0;
        for (int i = 0; i < first.length(); i++) {
            int asciiFirst = (int) first.charAt(i) - 97;
            firstval=firstval*10+asciiFirst;
        }
        for (int j = 0; j < second.length(); j++) {
            int asciiSecond = (int) second.charAt(j) - 97;
            secondval=secondval*10+asciiSecond;
        }for (int k = 0; k < target.length(); k++) {
            int asciiTarget = (int) target.charAt(k) - 97;
            targetVal=targetVal*10+asciiTarget;
        }
        if (firstval + secondval == targetVal) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(wordCheck("bc","deb","daa"));
    }
}
