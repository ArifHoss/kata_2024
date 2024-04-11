package org.arif.DAY_13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveKDigitsTest {

    @Test
    void removeKDigits_01() {
        RemoveKDigits digits = new RemoveKDigits();
        String num = "1432219";
        int k = 3;
        String actual = digits.removeKDigits_01(num, k);
        String expected = "1219";
        assertEquals(expected,actual);

        String actual02 = digits.removeKDigits_01("10200", 1);
        String expected02 = "200";
        assertEquals(expected02, actual02);
    }
}