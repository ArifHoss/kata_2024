package org.arif.DAY_13;

import java.util.Arrays;

public class RemoveKDigits {

    public String removeKDigits_01(String num, int k) {
        if (k == num.length()) return "0";
        if (k == 0) return num;
        char[] digits = num.toCharArray();
        char[] newDigits = new char[digits.length];

        int top = -1;
        int removalCount = k;
        for (int i = 0; i < digits.length; i++) {
            while (removalCount > 0 && top >= 0 && newDigits[top] > digits[i]) {
                top--;
                removalCount--;
            }
            top++;
            newDigits[top] = digits[i];
        }
        int nonZeroStart = 0;

        while (newDigits[nonZeroStart] == '0' && nonZeroStart < digits.length - k - 1) {
            nonZeroStart++;
        }

        return String.valueOf(newDigits, nonZeroStart, digits.length - k - nonZeroStart);

    }

    public String removeKDigits(String num, int k) {

        StringBuilder sb = new StringBuilder();
        sb.append(num.charAt(0));
        if (k == 0) return num;
        for (int i = 1; i < num.length(); i++) {
            if (k > 0 && sb.length() > 0 && num.charAt(i) < sb.charAt(sb.length() - 1)) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
                i--;
                continue;
            }
            sb.append(num.charAt(i));
        }

        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }
        while (sb.length() > 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);

        if (sb.length() == 0) sb.append('0');
        return sb.toString();
    }
}

/*
class Solution {
    public static String removeKdigits(String num, int k) {
		char[] digits = num.toCharArray();
		if (k == num.length()) {
			return "0";
		}

		char[] stack = new char[digits.length];
		int stackTop = -1;
		int removalCount = k;

		for (int i = 0; i < digits.length; i++) {
			while (removalCount > 0 && stackTop >= 0 && stack[stackTop] > digits[i]) {
				stackTop--;
				removalCount--;
			}
			stackTop++;
			stack[stackTop] = digits[i];
		}

		int nonZeroStart = 0;

		while (stack[nonZeroStart] == '0' && nonZeroStart < digits.length - k - 1) {
			nonZeroStart++;
		}

		return String.valueOf(stack, nonZeroStart, digits.length - k - nonZeroStart);
	}
}
 */
