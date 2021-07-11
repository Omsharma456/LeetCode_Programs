package Array;

import java.util.Scanner;
import java.util.Stack;

public class Check_Brackets {
    public static boolean checkBrack(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
            }else if (stack.peek() == '{' && s.charAt(i) == '}') {
                stack.pop();
            }else if (stack.peek() == '[' && s.charAt(i) == ']') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([){20+2(24)94}]";
        System.out.println(checkBrack(s));
    }
}
