package cn.abelib.solution.zero;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-04-17 23:35
 */
public class JumpGame55 {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int max = 0;
        for (int i = 0; i < len; i ++) {
            max = Math.max(max, nums[i] + i);
            if (i > max)  {

            }

        }
        return false;
    }

    @Test
    public void test() {
        System.err.println(canJump(new int[] {3,2,1,0,4}));
    }
}
