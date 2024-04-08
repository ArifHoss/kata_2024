package org.arif.DAY_08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementsTest {

    @Test
    void removeElements() {
        RemoveElements elements = new RemoveElements();
        int[] nums = {3, 2, 2, 3};
       int actual = elements.removeElements(nums, 3);
        assertEquals(2, actual);
    }
}