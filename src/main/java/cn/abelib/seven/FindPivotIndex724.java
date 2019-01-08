package cn.abelib.seven;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-09 00:18
 */
public class FindPivotIndex724 {
    public int pivotIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2 || nums.length == 0) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
        }
        int sum2 = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (sum == sum2 * 2 + nums[i]) {
               return i;
            }
            sum2 += nums[i];
        }
        return -1;
    }

    @Test
    public void pivotIndexTest() {
        int[] nums = {1, 1};
        System.out.println(pivotIndex(nums));
    }
}
