package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long number=sc.nextInt();
        long reverse=0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number/=10;
        }
        System.out.println(reverse);
    }
}
