package cn.abelib.solution.three;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2021-03-01 22:18
 */
public class NumberOfLongestIncreasingSubsequence673 {
    public int findNumberOfLIS(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int[] dp = new int[len];
        int[] comb = new int[len];
        Arrays.fill(dp, 1);
        Arrays.fill(comb, 1);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                        comb[i] = comb[j];

                    } else if (dp[j] + 1 == dp[i]) {
                        comb[i] += comb[j];
                    }
                }
            }
        }

        int max = Arrays.stream(dp).max().getAsInt();
        int ans = 0;
        for (int i = 0; i < len; i ++) {
            if (dp[i] == max) {
                ans += comb[i];
            }
        }
        return ans;
    }

    @Test
    public void findNumberOfLISTest() {
        int[] nums = {1, 3, 5, 4, 7};
        System.err.println(findNumberOfLIS(nums));
    }


    @Test
    public void findNumberOfLIS2Test() {
        int[] nums = {4, 3, 2, 1};
        System.err.println(findNumberOfLIS(nums));
    }

    @Test
    public void findNumberOfLIS3Test() {
        int[] nums = {1, 2, 3, 4};
        System.err.println(findNumberOfLIS(nums));
    }
}
