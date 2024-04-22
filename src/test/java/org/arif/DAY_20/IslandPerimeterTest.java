package org.arif.DAY_20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandPerimeterTest {

    @Test
    void islandPerimeter() {
        IslandPerimeter island = new IslandPerimeter();
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        int actual = island.islandPerimeter(grid);
        int expected = 16;
        assertEquals(expected, actual);
    }
}