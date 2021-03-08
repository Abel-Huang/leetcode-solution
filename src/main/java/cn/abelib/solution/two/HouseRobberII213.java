package cn.abelib.solution.two;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2021-02-28 16:04
 */
public class HouseRobberII213 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        return Math.max(subRob(Arrays.copyOfRange(nums, 1, len)),
                subRob(Arrays.copyOfRange(nums, 0, len - 1)));
    }

    public int subRob(int[] nums) {
        int n = nums.length;
        if (n < 1) {
            return 0;
        }
        int curr = 0, pre1 = 0, pre2 = 0;

        for (int num : nums) {
            curr = Math.max(pre1 + num, pre2);
            pre1 = pre2;
            pre2 = curr;
        }
        return curr;
    }

    @Test
    public void robTest() {
        int[] nums = {1};
        System.err.println(rob(nums));
    }
}
