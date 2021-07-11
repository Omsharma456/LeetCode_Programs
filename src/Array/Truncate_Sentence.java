package Array;

import java.util.ArrayList;

public class Truncate_Sentence {
    public static String truncateSentence(int k, String s) {
        String[] arr = s.split(" ");
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < k; i++) {
            ans.append(i!=k-1 ? arr[i]+" ":arr[i]);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence(1,"om narayan sharma"));
    }
}
