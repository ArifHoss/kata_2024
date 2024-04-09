package org.arif.DAY_09;

public class FindIndex {
    public int strStr(String hayStack, String needle) {
        System.out.println(hayStack.length() - needle.length());
        if (hayStack.contains(needle)) {
            return hayStack.indexOf(needle);
        } else {
            return -1;
        }
    }

    public int strStr1(String haystack, String needle) {
        int index = -1;
        if (needle.length() > haystack.length()) return -1;

        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            index = i;

            while (i < haystack.length()) {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    j++;
                    if (j == needle.length()) {
                        return index;
                    }
                } else {
                    break;
                }
            }
            i = index;
        }
        return -1;
    }
}
