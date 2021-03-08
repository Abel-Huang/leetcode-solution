package cn.abelib.solution.eleven;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-03-02 22:49
 * 建立一个二维数据dp[i][j], dp[i][j]表示到第一个字符串的i位置和第二个字符串的j位置
 * 最长的公共子序列长度
 */
public class LongestCommonSubsequence1143 {

    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();

        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 1; i <= len1; i ++) {
            for (int j = 1; j <= len2; j ++) {
                if (text1.charAt(i - 1)== text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[len1][len2];
    }

    @Test
    public void longestCommonSubsequenceTest() {
        String text1 = "abcde", text2 = "ace";

        System.err.println(longestCommonSubsequence(text1, text2));
    }

    @Test
    public void longestCommonSubsequence2Test() {
        String text1 = "ace", text2 = "ace";

        System.err.println(longestCommonSubsequence(text1, text2));
    }
}
