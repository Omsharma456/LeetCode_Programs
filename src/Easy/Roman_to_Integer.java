package Easy;


import java.util.HashMap;
import java.util.Scanner;

public class Roman_to_Integer {
    static int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
    public static int romantoint(String s){
        s.toUpperCase();
        int totalValue=0;
        int valueminus=0;
        //Checking validity
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' || s.charAt(i) == 'V' || s.charAt(i) == 'X' || s.charAt(i) == 'L' || s.charAt(i) == 'C'
                    || s.charAt(i) == 'D' || s.charAt(i) == 'M') {
                continue;
            } else {
                System.out.println("You should enter only I,V,X,L,C,D or M ");
                romantoint(s);
            }
        }
        for(int i=0; i<s.length(); i++) {
            int j=i+1;
            if(s.charAt(i)=='I' && s.charAt(j)=='V'){
                 valueminus+=V-I;
            } else if (s.charAt(i) == 'V' && s.charAt(j) == 'X') {
                 valueminus+=X-V;
            } else if (s.charAt(i) == 'X' && s.charAt(j) == 'L') {
                 valueminus+=L-X;
            } else if (s.charAt(i) == 'L' && s.charAt(j) == 'C') {
                valueminus+=C-L;
            } else if (s.charAt(i) == 'C' && s.charAt(j) == 'D') {
                valueminus+=D-C;
            } else if (s.charAt(i) == 'D' && s.charAt(j) == 'M') {
                valueminus += M - D;
            } else {
                if (s.charAt(i) == 'I') {
                    totalValue+=I;
                } else if (s.charAt(i) == 'V') {
                    totalValue+=V;
                } else if (s.charAt(i) == 'X') {
                    totalValue+=X;
                } else if (s.charAt(i) == 'L') {
                    totalValue+=L;
                } else if (s.charAt(i)=='C') {
                    totalValue+=C;
                } else if (s.charAt(i) == 'D') {
                    totalValue+=D;
                } else if (s.charAt(i) == 'M') {
                    totalValue+=M;
                }
            }
        }
        return totalValue+valueminus;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(romantoint(s));
    }
}
