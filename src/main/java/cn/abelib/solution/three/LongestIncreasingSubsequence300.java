package cn.abelib.solution.three;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2021-03-01 21:47
 */
public class LongestIncreasingSubsequence300 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int[] dp = new int[len];
        Arrays.fill(dp, 1);

        for (int i = 0; i < len; i ++) {
            for (int j = 0; j < i; j ++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        return Arrays.stream(dp).max().getAsInt();
    }

    @Test
    public void lengthOfLIS1Test() {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.err.println(lengthOfLIS(nums));
    }

    @Test
    public void lengthOfLIS2Test() {
        int[] nums = {4, 3, 2, 1};
        System.err.println(lengthOfLIS(nums));
    }
}
