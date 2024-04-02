package org.arif.DAY_03;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        /*
        I = 1
        V = 5
        X = 10
        L = 50
        C = 100
        D = 500
        M = 1000
         */
        String s = "XXVII";
        int result = romanToInt(s);
        System.out.println(result);
    }


    private static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int toInt = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {

            char romanKey = s.charAt(i);
            Integer value = map.get(romanKey);

            if (i < length - 1 && value < map.get(s.charAt(i + 1))) {
                toInt -= value;
            } else {
                toInt += value;
            }
        }

        return toInt;
    }

    private static int romanToInt02(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {

            int current = romanCharToInteger(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = romanCharToInteger(s.charAt(i + 1));
                if (current < next) {
                    total += current;
                } else {
                    total += current;
                }
            } else {
                total += current;
            }
        }

        return total;
    }

    private static int romanCharToInteger(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("INVALID_ROMAN");
        };
    }
}
