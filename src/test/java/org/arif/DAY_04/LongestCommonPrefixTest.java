package org.arif.DAY_04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        String[] strs = {"flower", "hello", "how"};
        String result = LongestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("",result);
    }

    @Test
    void longestCommonPrefixReturnFl() {
        String[] strs = {"flower", "flow", "flight"};
        String result = LongestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("fl",result);
    }

    @Test
    void longestCommonPrefix02() {
        String[] strs = {"flower", "flow", "flight"};
        String result = LongestCommonPrefix.longestCommonPrefix02(strs);
        assertEquals("fl",result);
    }
}