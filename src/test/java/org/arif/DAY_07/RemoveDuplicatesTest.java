package org.arif.DAY_07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicates duplicates = new RemoveDuplicates();
        int[] array = {0, 0, 1, 1, 1, 1, 2, 3, 4};
        int actual = duplicates.removeDuplicates(array);
        assertEquals(5, actual);
    }
}