package org.arif.DAY_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('(');

        String s = "()";
        String s1 = "{[]}";
        boolean b = isValidP(s);
        System.out.println(b);
    }

    private static boolean isValidP(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private static boolean isValidP02(String s) {
        int lastOpeningIndex = -1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                lastOpeningIndex++;
                s = s.substring(0, lastOpeningIndex) + c + s.substring(lastOpeningIndex + 1);
            } else {
                if (lastOpeningIndex < 0) return false; // If there's no opening bracket left
                char lastOpening = s.charAt(lastOpeningIndex);
                if ((c == ')' && lastOpening == '(') ||
                        (c == '}' && lastOpening == '{') ||
                        (c == ']' && lastOpening == '[')) {
                    // Remove the last opening bracket
                    s = s.substring(0, lastOpeningIndex) + s.substring(lastOpeningIndex + 1);
                    lastOpeningIndex--;
                } else {
                    return false; // If closing bracket does not match the last opening bracket
                }
            }
        }
        return lastOpeningIndex == -1; // Check if all opening brackets have been matched
    }

    public boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                System.out.println("s = " + s);
                return s.isEmpty();
            }
        }
    }
}
