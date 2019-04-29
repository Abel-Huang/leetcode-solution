package cn.abelib.four;

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
                    if (i == 0 || i == grid.length - 1) {
                        result ++;
                        if (j > 0 && j < grid[0].length - 1) {
                            if (grid[i][j - 1] == 0 ) {
                                result ++;
                            }
                            if (grid[i][j + 1] == 0 ) {
                                result ++;
                            }
                        }
                    }
                    if (j == 0 || j == grid[0].length - 1) {
                        result ++;
                        if (i > 0 && i < grid.length - 1) {
                            if (grid[i - 1][j] == 0 ) {
                                result ++;
                            }
                            if (grid[i + 1][j] == 0 ) {
                                result ++;
                            }
                        }
                    }
                    if (i > 0 && i < grid.length - 1 && j > 0 && j < grid[0].length - 1) {
                        if (grid[i - 1][j] == 0 ) {
                            result ++;
                        }
                        if (grid[i + 1][j] == 0 ) {
                            result ++;
                        }
                        if (grid[i][j - 1] == 0 ) {
                            result ++;
                        }
                        if (grid[i][j + 1] == 0 ) {
                            result ++;
                        }
                    }
                }
            }
        }
        return result;
    }

    @Test
    public void islandPerimeterTest() {
        System.out.println();
    }
}
