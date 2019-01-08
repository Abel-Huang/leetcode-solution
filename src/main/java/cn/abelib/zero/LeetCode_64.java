package cn.abelib.zero;

import java.lang.Math;
import java.lang.String;
import java.lang.System;

/**
 * Created by abel-huang on 2016/8/2.
 * DP problems.
 */
public class LeetCode_64 {
    public static void main(String args[]) {
        int[][] grid = {{1, 2}, {5, 6}, {1, 1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        if (grid.length == 0)
            return 0;
        if (grid[0].length == 0)
            return 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && j > 0)
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }
}
