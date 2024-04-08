package org.arif.DAILY_CHALANGE;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/valid-parenthesis-string/description/?envType=daily-question&envId=2024-04-07">...</a>
 * <p>
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
 * </p>
 * s = "()" == true
 * s = "(*)" == true
 * s = "(" == true
 */
public class ValidParenthesisString {
    public boolean checkValidString(String s) {

        int leftCount = 0, rightCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftCount++;
                rightCount++;
            } else if (c == ')') {
                rightCount--;
                leftCount--;
            } else {
                leftCount--;
                rightCount++;
            }
            if (rightCount < 0) return false;
            if (leftCount < 0) leftCount = 0;
        }
        return leftCount == 0;
    }


    public boolean checkValidString01(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open.push(i);
            } else if (ch == '*') {
                star.push(i);
            } else if (ch == ')') {
                if (!open.isEmpty()) {
                    open.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }

        while (!open.isEmpty()) {
            if (star.isEmpty()) {
                return false;
            } else if (open.peek() < star.peek()) {
                open.pop();
                star.pop();
            } else {
                return false;
            }
        }
        return true;
    }

}
