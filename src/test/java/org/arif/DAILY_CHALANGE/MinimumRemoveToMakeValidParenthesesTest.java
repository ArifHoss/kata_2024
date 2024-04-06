package org.arif.DAILY_CHALANGE;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumRemoveToMakeValidParenthesesTest {

    @Test
    void minRemoveToMakeValid() {
        MinimumRemoveToMakeValidParentheses minimum = new MinimumRemoveToMakeValidParentheses();
        String actual = minimum.minRemoveToMakeValid("(A");
        String expected = "A";
        assertEquals(expected, actual);
    }
}