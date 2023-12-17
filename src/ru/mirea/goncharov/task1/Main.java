package ru.mirea.goncharov.task1;

import java.util.Stack;

public class Main {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : expression.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (bracket == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (bracket == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp = "[()]{}{[()()]()}";
        //String exp = "[(])";
        boolean result = isBalanced(exp);
        System.out.println("Balanced? : " + result);
    }
}

