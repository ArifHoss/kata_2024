package org.arif.DAILY_CHALANGE;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("leEeetcode");

        int i = 0;
        while (i < sb.length() - 1) {
            char x = sb.charAt(i);
            char y = sb.charAt(i + 1);
            if (Math.abs(x - y) == 32) {
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

            System.out.println(sb);

    }
}
