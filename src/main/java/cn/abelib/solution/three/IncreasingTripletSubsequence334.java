package cn.abelib.solution.three;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-03-01 22:03
 */
public class IncreasingTripletSubsequence334 {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;

        if (len < 3) {
            return false;
        }

        int[] dp = new int[len];

        for (int i = 0; i < len; i ++) {
            for (int j = 0; j < i; j ++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    if (dp[i] == 2) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    @Test
    public void lengthOfLIS1Test() {
        int[] nums = {1,2,3,4,5};
        System.err.println(increasingTriplet(nums));
    }

    @Test
    public void lengthOfLIS2Test() {
        int[] nums = {5,4,3,2,1};
        System.err.println(increasingTriplet(nums));
    }

    @Test
    public void lengthOfLIS3Test() {
        int[] nums = {2,1,5,0,4,6};
        System.err.println(increasingTriplet(nums));
    }
}
