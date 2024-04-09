package org.arif.DAY_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsertPosition() {

        SearchInsertPosition position = new SearchInsertPosition();

        int[] nums = {1, 3, 5, 6};
        int actual = position.searchInsertPosition(nums, 5);
        assertEquals(2,actual);

    }
}