package org.arif.DAILY_CHALANGE;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/?envType=daily-question&envId=2024-04-06">...</a>
 */
public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        int counter = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (c == '(') {
                counter++;
            } else if (c == ')') {
                if (counter == 0) {
                    array[i] = '*';
                } else {
                    counter--;
                }
            }
        }

        for (int i = array.length - 1; i >= 0 && counter > 0; i--) {
            char c = array[i];
            if (c == '(') {
                array[i] = '*';
                counter--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            if (c != '*') sb.append(c);
        }

        return sb.toString();
    }

}

/*
class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> para = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ')') {
                if (para.size() != 0 && chars[para.getLast()] == '(') {
                    para.removeLast();
                } else {
                    para.add(i);
                }
            } else if (chars[i] == '(') {
                 para.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (para.size() != 0 && para.getFirst() == i) {
                para.pop();
                continue;
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
 */

/*
class Solution {
    public String minRemoveToMakeValid(String s) {
        int opens = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) == '(') {
                opens++;
            } else {
                if(opens > 0) {
                    if(s.charAt(i) == ')')
                        opens--;
                } else {
                    if(s.charAt(i) == ')')
                        continue;
                }
            }
            sb.append(s.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        if(opens > 0) {
            for(int i = sb.length()-1; i >=0 ; i--)  {
                if(sb.charAt(i) == '(' && opens > 0){
                    opens--;
                    continue;
                }
                res.append(sb.charAt(i));
            }
        } else {
            return sb.toString();
        }
        return res.reverse().toString();
    }
}
 */