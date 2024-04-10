package org.arif.DAILY_CHALANGE;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        int result = timeNeed(nums, 2);
        System.out.println(result);
    }

    private static int timeNeed(int[] nums, int k) {
        int index = 0, counter = 0;

        while ( nums[k] > 0) {

            if (index >= nums.length) index = 0;

            if (nums[index] > 0) {
                nums[index]--;
                counter++;
            }
            index++;
        }
        return counter;
    }

    private static boolean validParenthesisString(String s) {
        int left = 0, right = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
                right++;
            } else if (c == ')') {
                left--;
                right--;
            } else {
                left--;
                right++;
            }
            if (right < 0) return false;
            if (left < 0) left = 0;
        }
        return left == 0;

    }
}
