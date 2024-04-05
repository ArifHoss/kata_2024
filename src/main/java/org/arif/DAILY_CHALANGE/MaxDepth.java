package org.arif.DAILY_CHALANGE;

public class MaxDepth {
    public static void main(String[] args) {
        int n = (1 + (2 * 3) + ((8) / 4)) + 1;
        System.out.println(n);
        String s = "(1 + (2 * 3) + ((8+8) / 4)) + 1";
        int maximumDepth = maxDepth1(s);
        System.out.println(maximumDepth);
        System.out.println(maxDepth1("(1+(2*2)+(2/2)"));

    }

    private static int maxDepth1(String s) {
        int counter = 0;
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                counter++;
                if (depth < counter) {
                    depth = counter;
                }
            }
            if (c == ')') {
                counter--;
            }
        }
        return depth;
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
