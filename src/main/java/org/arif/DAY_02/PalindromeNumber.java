package org.arif.DAY_02;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        boolean palindrome = isPalindrome(x);
        System.out.println(palindrome);
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(1));
    }

    private static boolean isPalindrome(int x) {
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