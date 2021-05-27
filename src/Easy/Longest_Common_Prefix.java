package Easy;

import java.util.Scanner;

import static java.lang.System.exit;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"flower", "fow", "flight","fault"};
        String commonprefix=" ";
        for (int i = 0; i < arr[0].length(); i++) {
            char index=arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (index != arr[j].charAt(i)) {
                    System.out.println(commonprefix);
                    exit(0);
                }
            }
            commonprefix+=index;
        }
        System.out.println(commonprefix);
    }
}
