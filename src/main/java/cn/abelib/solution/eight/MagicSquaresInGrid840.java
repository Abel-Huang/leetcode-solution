package cn.abelib.solution.eight;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-09 01:07
 */
public class MagicSquaresInGrid840 {
    public int numMagicSquaresInside(int[][] grid) {
        if (grid.length < 3) {
            return 0;
        }
        if (grid[0].length < 3) {
            return 0;
        }
        int cnt = 0;
        for (int j = 1; j < grid.length - 1; j++) {
            for (int i = 1; i < grid[j].length - 1; i++) {
                if (
                       grid[i][j] == 5
                    &&  grid[i - 1][j - 1] != 5
                    &&  grid[i - 1][j + 1] != 5
                    &&  grid[i - 1][j] != 5
                    &&  grid[i][j - 1] != 5
                    &&  grid[i][j + 1] != 5
                    &&  grid[i][j] != 5
                    &&  grid[i + 1][j + 1] != 5
                    &&  grid[i + 1][j - 1] != 5
                    &&  grid[i + 1][j] != 5
                    &&  grid[i - 1][j - 1] + grid[i + 1][j + 1] == 10
                    &&  grid[i - 1][j + 1] + grid[i + 1][j - 1] == 10
                    &&  grid[i][j - 1] + grid[i][j + 1] == 10
                    &&  grid[i - 1][j] + grid[i + 1][j] == 10
                    && grid[i - 1][j] + grid[i - 1][j - 1] + grid[i - 1][j + 1] == 15
                    && grid[i + 1][j] + grid[i + 1][j - 1] + grid[i + 1][j + 1] == 15
                    && grid[i - 1][j - 1] + grid[i][j - 1] + grid[i + 1][j - 1] == 15
                    && grid[i - 1][j + 1] + grid[i][j + 1] + grid[i + 1][j + 1] == 15) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    @Test
    public void numMagicSquaresInsideTest() {
        int[][] grid = {{4, 3, 8, 4},
                {9, 5, 1, 9},
                {2, 7, 6, 2}};

        System.out.println(numMagicSquaresInside(grid));
    }
}

