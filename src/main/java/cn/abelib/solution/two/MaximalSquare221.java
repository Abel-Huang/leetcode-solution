package cn.abelib.solution.two;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-02-28 14:36
 * 三者取最小 + 1
 */
public class MaximalSquare221 {
    public int maximalSquare(char[][] matrix) {
        int l1 = matrix.length;
        int l2 = matrix[0].length;

        int[][] dp = new int[l1][l2];

        int max = 0;
        for (int i = 0; i < l1; i ++) {
            for (int j = 0; j < l2; j ++) {
                if (i == 0 || j == 0) {
                    if (matrix[i][j] == '0') {
                        dp[i][j] = 0;
                    } else if (matrix[i][j] == '1') {
                        dp[i][j] = 1;
                    }
                } else {
                    if (matrix[i][j] == '1') {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]),dp[i - 1][j - 1]) + 1;
                    } else {
                        dp[i][j] = 0;
                    }
                }

                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }

        return max * max;
    }

    @Test
    public void maximalSquareTest1() {
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};

        System.err.println(maximalSquare(matrix));
    }

    @Test
    public void maximalSquareTest2() {
        char[][] matrix = {{'0'}};

        System.err.println(maximalSquare(matrix));
    }

    @Test
    public void maximalSquareTest3() {
        char[][] matrix = {{'0', '1'}, {'1', '0'}};

        System.err.println(maximalSquare(matrix));
    }

    @Test
    public void maximalSquareTest4() {
        char[][] matrix = {{'0','0','1','0'},{'0','1','1','1'},{'1','1','1','1'},{'0','1','1','1'}};

        System.err.println(maximalSquare(matrix));
    }
}
