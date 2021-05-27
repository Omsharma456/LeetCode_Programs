package Easy;

import java.util.Scanner;

public class add_digit_until_one_digit {
    static int addDigit(int num) {
        int sum=num;
        while (sum >= 10) {
            int sumdigit=0;
            while (num > 0) {
                sumdigit+=num%10;
                num/=10;
            }
            sum=sumdigit;
            num=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(addDigit(n));

    }
}
