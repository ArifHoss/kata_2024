package org.arif.DAY_20;

import java.util.LinkedList;

/**
 * <a href="https://leetcode.com/problems/number-of-islands/description/">...</a>
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int numberOfIsland = 0;
        LinkedList<int[]> list = new LinkedList<>();
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if (grid[row][column] == '1') {
                    numberOfIsland++;
                    list.add(new int[]{row, column});
                    checkIsland(grid, list);
                }
            }
        }
        return numberOfIsland;
    }

    private void checkIsland(char[][] grid, LinkedList<int[]> list) {
        while (!list.isEmpty()) {
            int[] polledFirst = list.pollFirst();
            int left = polledFirst[0];
            int right = polledFirst[1];
            if (left >= 0 && left < grid.length && right >= 0 && right < grid[0].length && grid[left][right] == '1') {
                grid[left][right] = 0;
                list.addLast(new int[]{left - 1, right});
                list.addLast(new int[]{left + 1, right});
                list.addLast(new int[]{left, right - 1});
                list.addLast(new int[]{left, right + 1});
            }
        }
    }


    /*
    public int numIslands(char[][] grid) {
        if(grid == null){
            return 0;
        }

        int result = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    result += dfs(grid, i, j);
                }
            }
        }
        return result;
    }

    public int dfs(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return 0;
        }

        grid[i][j] = '0';

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);

        return 1;
    }
     */


}
