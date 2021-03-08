package cn.abelib.solution.two;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2021-02-28 15:37
 */
public class PerfectSquares279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];

        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;

        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j * j <= i; j ++) {
                dp[i] = Math.min(dp[i], dp[i- j * j] + 1);
            }
        }

        return dp[n];
    }

    @Test
    public void numSquaresTest() {
        System.err.println(numSquares(1000));
    }
}
