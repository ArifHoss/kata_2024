package org.arif.DAY_23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenTheLockTest {

    @Test
    void openLock() {
        OpenTheLock open = new OpenTheLock();

        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        int actual = open.openLock(deadends, target);
        int expected = 6;
        assertEquals(expected, actual);

    }
}