package org.arif.DAY_14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TappingRainWaterTest {

    @Test
    void trap() {
        TappingRainWater tap = new TappingRainWater();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int actualTrapped = tap.trap(height);
        int expected = 6;
        assertEquals(expected, actualTrapped);
        int[] height2 = {4, 2, 0, 3, 2, 5};
        int actualTrapped2 = tap.trap(height2);
        assertEquals(9,actualTrapped2);
    }
}