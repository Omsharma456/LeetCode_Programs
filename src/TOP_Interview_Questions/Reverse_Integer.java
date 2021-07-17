package TOP_Interview_Questions;

public class Reverse_Integer {
    public static int revInteger(int a) {
        long rev=0;
        while (a != 0) {
            rev=rev*10+a%10;
            a/=10;
        }
        if(rev> Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
        return (int)rev;
    }

    public static void main(String[] args) {
        System.out.println(revInteger(-123));
    }
}
