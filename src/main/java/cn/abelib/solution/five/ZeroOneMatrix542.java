package cn.abelib.solution.five;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-02-23 22:44
 *  从左上到右下和从右下到左上进行两次动态规划遍历
 *
 */
public class ZeroOneMatrix542 {

    public int[][] updateMatrix(int[][] matrix) {
        int l1 = matrix.length;
        if (l1 < 1) {
            return matrix;
        }
        int l2 = matrix[0].length;
        if (l2 < 1) {
            return matrix;
        }

        int[][] dp = new int[l1][l2];
        for (int i = 0; i < l1; i ++) {
            for (int j = 0; j < l2; j ++) {
                dp[i][j] = Integer.MAX_VALUE - 10;
            }
        }

        for (int i = 0; i < l1; i ++) {
            for (int j = 0; j < l2; j ++) {
                if (matrix[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    if (i > 0) {
                        dp[i][j] = Math.min(dp[i - 1][j] + 1,  dp[i][j]);
                    }
                    if (j > 0) {
                        dp[i][j] = Math.min(dp[i][j - 1] + 1,  dp[i][j]);
                    }
                }
            }
        }

        for (int i = l1 - 1; i >= 0; i --) {
            for (int j = l2 - 1; j >= 0; j --) {
                if (matrix[i][j] != 0) {
                    if (i < l1 - 1) {
                        dp[i][j] = Math.min(dp[i + 1][j] + 1,  dp[i][j]);
                    }
                    if (j < l2 - 1) {
                        dp[i][j] = Math.min(dp[i][j + 1] + 1,  dp[i][j]);
                    }
                }
            }
        }

        return dp;
    }

    @Test
    public void updateMatrixTest() {
        int[][] matrix = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        System.err.println(updateMatrix(matrix));
    }
}
