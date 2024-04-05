package org.arif.DAILY_CHALANGE;

import java.util.Stack;

public class MakeGood {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(c - stack.peek()) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

    // StringBuilder
    public String makeGoodBuilder(String s) {

        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        while (i < sb.length() - 1) {
            if (Math.abs(sb.charAt(i)) - sb.charAt(i + 1) == 32) {
                sb.delete(i, i + 2);
                if (i > 0) {
                    i--;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    // Recursive
    public String makeGoodRecursive(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32) {
                return makeGood(s.substring(0, i) + s.substring(i + 2));
            }
        }
        return s;
    }
}
