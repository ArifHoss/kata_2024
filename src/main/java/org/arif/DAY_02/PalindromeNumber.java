package org.arif.DAY_02;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 1234;
        boolean palindrome = isPalindrome(x);
        System.out.println(palindrome);
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x; // 121
        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }
        return reversed == x;
    }


    private static boolean isPalindrome04(int x) {
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.contentEquals(sb);
    }

    private static boolean isPalindrome03(int i) {
        int x = 0;
        int start = i;
        while (start > 0) {
            x = (x * 10) + (start % 10);
            start = start / 10;
        }
        return x == i;
    }


    private static boolean isPalindrome02(int x) {
        String s = "" + x;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

/**
 * 9. Palindrome Number
 * Easy
 * <p>
 * Topics
 * Companies
 * <p>
 * Hint
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */