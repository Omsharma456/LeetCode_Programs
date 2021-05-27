package Easy;

public class palindrome {
    public static boolean isPalindrome(int x) {
        boolean check=true;
        int num=x;
        int rev=0;
        while (x != 0) {
            rev=rev*10+x%10;
            x/=10;
        }
        if (num<0 || num!=rev) {
            check = false;
            return check;
        } else {
            return check;
        }
    }
    public static void main(String[] args) {
        int n=-121;
        System.out.println(isPalindrome(n));
    }
}
