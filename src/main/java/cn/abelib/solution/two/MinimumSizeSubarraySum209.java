package cn.abelib.solution.two;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-07-21 21:28
 */
public class MinimumSizeSubarraySum209 {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if (len < 1) {
            return 0;
        }
        if (len == 1) {
            if (nums[0] >= s) {
                return 1;
            } else {
                return 0;
            }
        }
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < len; i ++) {
            sum += nums[i];
            while (sum >= s) {
                ans = Math.min(i - left + 1, ans);
                if (ans == 1) {
                    return 1;
                }
                sum -= nums[left];
                left ++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    @Test
    public void minSubArrayLenTest() {
        System.err.println(minSubArrayLen(8, new int[]{2,3,1,2,4,3}));

        System.err.println(minSubArrayLen(8, new int[]{1,1,9,2,1,3}));
    }
}
