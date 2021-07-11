package Easy;

public class Longest_Common_Prefix {
    public static String commPrefix(String[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < arr[i - 1].length()) {
                index = i;
            }
        }
        String minItem = arr[index];
        String result="";

        loop: for (int i = 0; i < minItem.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (minItem.charAt(i) != arr[j].charAt(i)) {
                    break loop;
                }
            }
            result+=minItem.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"flower","flow",""};
        System.out.println(commPrefix(arr));

    }
}
