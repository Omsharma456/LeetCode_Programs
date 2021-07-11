package Array;

import java.util.Stack;

public class valid_parenthesis {
    public static boolean validParen(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(validParen("()[]{}"));
    }
}
