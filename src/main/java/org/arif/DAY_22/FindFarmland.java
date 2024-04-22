package org.arif.DAY_22;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-all-groups-of-farmland/description/?envType=daily-question&envId=2024-04-20">...</a>
 */
public class FindFarmland {
    public int[][] findFarmland(int[][] land) {
        List<int[]> result = new ArrayList<>();


        for (int row = 0; row < land.length; row++) {
            for (int column = 0; column < land[row].length; column++) {
                if (land[row][column] == 1) {
                    int[] coordinates = findFarmlandCoordinates(land, row, column);
                    result.add(coordinates);
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    private int[] findFarmlandCoordinates(int[][] land, int row, int column) {
        int[] coordinates = new int[4];
        coordinates[0] = row;
        coordinates[1] = column;

        int r = row;
        int c = column;

        while (r < land.length && land[r][column] == 1) r++;
        while (c < land[row].length && land[row][c] == 1) c++;
        coordinates[2] = r - 1;
        coordinates[3] = c - 1;

        for (int i = row; i < r; i++) {
            for (int j = column; j < c; j++) {
                land[i][j] = 0;
            }
        }
        return coordinates;
    }
}
