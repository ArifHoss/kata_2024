package org.arif.DAY_03;

public class Main {
    public static void main(String[] args) {
        String s = "LVIII";
        int result = romanToInteger(s);
        System.out.println(result);
    }

    private static int romanToInteger(String s) {

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int value = ifCharIsRomanSwitchToInteger(s.charAt(i));
            if (i < n - 1 && value < ifCharIsRomanSwitchToInteger(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }

    private static int ifCharIsRomanSwitchToInteger(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("NOT_A_ROMAN");
        };
    }
}
