package org.arif.DAY_20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    @Test
    void numIslands() {
        NumberOfIslands islands = new NumberOfIslands();
        char[][] gird = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int actual = islands.numIslands(gird);
        int expected = 1;
        assertEquals(expected, actual);

    }
}