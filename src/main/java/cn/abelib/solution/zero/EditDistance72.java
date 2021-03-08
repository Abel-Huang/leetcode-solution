package cn.abelib.solution.zero;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-03-04 21:37
 */
public class EditDistance72 {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();

        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j ++) {
                if (i == 0) {
                    dp[0][j] = j;
                } else if (j == 0) {
                    dp[i][0] = i;
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + ((word1.charAt(i - 1) == word2.charAt(j - 1)) ? 0 : 1), Math.min(dp[i - 1][j], dp[i][j - 1]) + 1);
                }
            }
        }
        return dp[len1][len2];
    }

    @Test
    public void minDistanceTest() {
        String word1 = "acc", word2 = "abc";
        System.err.println(minDistance(word1, word2));
    }
}
