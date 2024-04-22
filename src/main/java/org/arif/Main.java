package org.arif;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{0, 1, 0, 0}};

        int result = islandP(grid);
        System.out.println(result);
    }

    private static int islandP(int[][] grid) {
        int counter = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if (grid[row][column] == 1) {
                    counter += 4;
                    if (row > 0 && grid[row - 1][column] == 1) {
                        counter -= 2;
                    }
                    if (column > 0 && grid[row][column - 1] == 1) {
                        counter -= 2;
                    }
                }
            }
        }
        return counter;
    }
}
