package cn.abelib.solution.nine;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-08 15:52
 */
public class ValidPermutationsForDISequence903 {
    public int numPermsDISequence(String S) {
        int N = S.length() + 1;
        double MOD = 1e9 + 7;
        // dp[i][j] means number of permutation whose length is i and end with at most j.
        double[][] dp = new double[202][202];
        dp[1][1] = 1;
        for (int i = 2; i <= N; ++i) {
            // length is i
            for (int j = 1; j <= i; ++j) {
                // end with j
                if (S.charAt(i - 2) == 'D') {
                    // decrease to j
                    dp[i][j] = (dp[i][j-1] + (dp[i-1][i-1] - dp[i-1][j-1]) % MOD) % MOD;
                } else {
                    // increase to j
                    dp[i][j] = (dp[i][j-1] + (dp[i-1][j-1] - dp[i-1][0]) % MOD) % MOD;
                }
            }
        }
        return (int) ((dp[N][N] + MOD) % MOD);
    }

    public int numPerms01Sequence(int[] num) {
        int N = num.length + 1;
        double MOD = 1e9 + 7;
        // dp[i][j] means number of permutation whose length is i and end with at most j.
        double[][] dp = new double[202][202];
        dp[1][1] = 1;
        for (int i = 2; i <= N; ++i) {
            // length is i
            for (int j = 1; j <= i; ++j) {
                // end with j
                if (num[i - 2] == 1) {
                    // decrease to j
                    dp[i][j] = (dp[i][j-1] + (dp[i-1][i-1] - dp[i-1][j-1]) % MOD) % MOD;
                } else {
                    // increase to j
                    dp[i][j] = (dp[i][j-1] + (dp[i-1][j-1] - dp[i-1][0]) % MOD) % MOD;
                }
            }
        }
        return (int) ((dp[N][N] + MOD) % MOD);
    }

    @Test
    public void test() {
        int[] num = {1, 1, 0};
        System.err.println(numPerms01Sequence(num));
    }
}
