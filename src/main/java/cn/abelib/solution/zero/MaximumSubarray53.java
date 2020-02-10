package cn.abelib.solution.zero;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-02-01 00:08
 */
public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;

        for (int num : nums) {
            if (sum > 0) {
                sum  += num;
            } else {
                sum = num;
            }
            ans = Math.max(sum, ans);
        }

        return ans;
    }

    @Test
    public void maxSubArrayTest() {
        int[] nums = {-2,1,-3,4,-1,2,1, -1};
        System.err.println(maxSubArray(nums));
    }
}
