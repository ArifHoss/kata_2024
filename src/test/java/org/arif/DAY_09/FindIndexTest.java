package org.arif.DAY_09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIndexTest {

    @Test
    void strStr() {
        FindIndex index = new FindIndex();
        String haystack = "sadbutsad", needle = "sad";
        int actual = index.strStr(haystack, needle);
        assertEquals(0, actual);
    }
}