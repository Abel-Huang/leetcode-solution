package cn.abelib.solution.four;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-03-01 00:45
 */
public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {
        if (grid.length < 1) {
            return 0;
        }
        int result = 0;
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j ++) {
                if (grid[i][j] == 1) {
                    result += 4;
                    if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                        result--;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        result--;
                    }
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        result--;
                    }
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        result--;
                    }
                }
            }
        }

        return result;
    }

    @Test
    public void islandPerimeterTest() {
        int[][] island = {{0,1,0,0},
                         {1,1,1,0},
                         {0,1,0,0},
                         {1,1,0,0}};
        System.out.println(islandPerimeter(island));
    }
}
