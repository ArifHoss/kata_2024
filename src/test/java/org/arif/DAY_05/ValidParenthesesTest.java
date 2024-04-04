package org.arif.DAY_05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValidParentheses() {
        ValidParentheses vp = new ValidParentheses();
        assertTrue(vp.isValid("()"));
    }

    @Test
    void isValidParentheses01() {
        ValidParentheses vp = new ValidParentheses();
        assertTrue(vp.isValid("({})"));
    }

    @Test
    void isValidParentheses02() {
        ValidParentheses vp = new ValidParentheses();
        assertFalse(vp.isValid("(]"));
    }
}