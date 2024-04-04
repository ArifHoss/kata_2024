package org.arif.DAILY_CHALANGE;

public class MaxDepth {
    public static void main(String[] args) {
        int n = (1 + (2 * 3) + ((8) / 4)) + 1;
        System.out.println(n);
        String s = "(1 + (2 * 3) + ((8) / 4)) + 1";
        System.out.println();

    }

    public int maxDepth(String s) {
        int counter = 0, maximumDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                counter++;
                if (maximumDepth < counter) {
                    maximumDepth = counter;
                }
            } else if (c == ')') {
                counter--;
            }
        }
        return maximumDepth;
    }
}
