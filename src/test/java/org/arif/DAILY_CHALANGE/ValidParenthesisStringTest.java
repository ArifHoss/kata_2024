package org.arif.DAILY_CHALANGE;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisStringTest {

    @Test
    void checkValidString() {
        ValidParenthesisString string = new ValidParenthesisString();
        boolean actual1 = string.checkValidString("()");
        boolean actual2 = string.checkValidString("(*)");
        boolean actual3 = string.checkValidString("(*");
        boolean actual4 = string.checkValidString("*)");
        boolean actual5 = string.checkValidString("(");
        boolean actual6 = string.checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()");

        assertTrue(actual1);
        assertTrue(actual2);
        assertTrue(actual3);
        assertTrue(actual4);
        assertFalse(actual5);
        assertTrue(actual6);


    }
}