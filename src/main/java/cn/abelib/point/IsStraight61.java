package cn.abelib.point;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2020-07-23 22:10
 */
public class IsStraight61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zero = 0;
        int dis = 0;
        for (int i = 0; i < nums.length - 1; i ++) {
            if (nums[i] == 0) {
                zero ++;
                continue;
            }
            if (nums[i] == nums[i + 1]) {
                return false;
            }
            if (nums[i] + 1 < nums[i + 1]) {
                dis += nums[i + 1] - nums[i] - 1;
            }
        }
        return zero >= dis;
    }

    @Test
    public void isStraightTest() {
        System.err.println(isStraight(new int[]{0, 6, 1, 3, 5}));
    }
}
