package org.arif.DAILY_CHALANGE;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthTest {

    @Test
    void maxDepth() {
        MaxDepth depth = new MaxDepth();
        String s = "(1 + (2 * 3) + ((8) / 4)) + 1";
        assertEquals(3, depth.maxDepth(s));
    }
    @Test
    void maxDepthEqualZero() {
        MaxDepth depth = new MaxDepth();
        String s = "(AB)";
        assertEquals(0, depth.maxDepth(s));
    }

}