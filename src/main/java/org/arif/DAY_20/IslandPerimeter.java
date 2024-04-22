package org.arif.DAY_20;

/**
 * <a href="https://leetcode.com/problems/island-perimeter/description/">...</a>
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {

        int landCounter = 0;

        int rows = grid.length;
        int columns = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (grid[i][j] == 1) {
                    landCounter += 4;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        landCounter -= 2;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {
                        landCounter -= 2;
                    }
                }
            }
        }
        return landCounter;
    }
}
