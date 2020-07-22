package cn.abelib.point;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2020-07-21 21:55
 */
public class SlidingWindowMaximum59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (len <= 1 || k == 1) {
            return nums;
        }
        int[] ans = new int[len - k + 1];
        for (int i = 0; i < len - k + 1; i ++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j ++) {
                max = Math.max(max, nums[j]);
            }
            ans[i] = max;
        }
        return ans;
    }

    @Test
    public void maxSlidingWindowTest() {
        System.err.println(Arrays.toString(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
    }
}
