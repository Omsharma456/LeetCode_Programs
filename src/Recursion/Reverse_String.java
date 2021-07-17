package Recursion;

public class Reverse_String {
    public static char[] rev(char[] s, int a_pointer, int b_pointer) {
        if (s.length == 0 || a_pointer<=b_pointer) {
            return s;
        }
        char temp=s[a_pointer];
        s[a_pointer]=s[b_pointer];
        s[b_pointer]=temp;
        return rev(s,a_pointer+=1,b_pointer-=1);
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'd'};
        System.out.println(rev(arr,0, arr.length-1));
    }
}
