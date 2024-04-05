package org.arif.DAILY_CHALANGE;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {
        String s = "abc";
        List<String> anagram = createAnagram(s);
        System.out.println(anagram);

    }

    private static List<String> createAnagram(String s) {
        List<String> result = new ArrayList<>();
        makeAnagram("", s, result);
        return result;
    }

    private static void makeAnagram(String prefix, String suffix, List<String> result) {
        if (suffix.length() == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                String newPrefix = prefix + suffix.charAt(i);
                String newSuffix = suffix.substring(0, i) + suffix.substring(i + 1);
                makeAnagram(newPrefix, newSuffix, result);
            }
        }

    }

    public static List<String> generateAnagram(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        result.add(s.substring(0, 1));
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            List<String> newResult = new ArrayList<>();
            for (String str : result) {
                for (int j = 0; j <= str.length(); j++) {
                    String newString = str.substring(0, j) + currentChar + str.substring(j);
                    newResult.add(newString);
                }
            }
            result = newResult;
        }
        return result;
    }
}
