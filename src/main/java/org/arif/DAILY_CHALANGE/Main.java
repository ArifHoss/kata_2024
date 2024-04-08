package org.arif.DAILY_CHALANGE;

public class Main {
    public static void main(String[] args) {
        String s = "(*))";
        boolean result = validParenthesisString(s);
        System.out.println(result);
    }
    private static boolean validParenthesisString(String s) {
        int left = 0, right = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
                right++;
            } else if (c == ')') {
                left--;
                right--;
            } else {
                left--;
                right++;
            }
            if (right < 0) return false;
            if (left < 0) left = 0;
        }
        return left == 0;

    }
}
