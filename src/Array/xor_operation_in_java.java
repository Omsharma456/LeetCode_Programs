package Array;

public class xor_operation_in_java {
    public static int XOR(int n, int start) {
        int sum=start;
        for (int i = 0; i < n; i++) {
            sum = sum ^ (start + 2 * i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(XOR(5,0));
    }
}
