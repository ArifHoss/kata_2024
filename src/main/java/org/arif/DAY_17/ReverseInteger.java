package org.arif.DAY_17;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1230;
        int reversed = reverse(x);
        System.out.println(reversed);
    }

    private static int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x))).reverse();

        int result = 0;
        try {
           result = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        boolean isNegative = x < 0;

        return isNegative ? - result : result;

    }
}

/*
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x!=0){
            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 | rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            else{
                rev = rev*10 + digit;
                x /= 10;
            }

        }
        return rev;
    }
}
 */
