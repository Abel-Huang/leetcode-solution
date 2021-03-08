package cn.abelib.solution.one;

import org.junit.Test;

/**
 *
 * @author abel-huang
 * @date 2016/8/1
 */
public class HouseRobber198 {
    public int rob(int[] nums) {
        int z = nums.length;
        if (z == 0) {
            return 0;
        }
        if (z == 1) {
            return nums[0];
        }
        if (z == 2) {
            return Math.max(nums[0], nums[1]);
        }
        nums[2] += nums[0];
        for (int i = 3; i < z; i++) {
            nums[i] += Math.max(nums[i - 2], nums[i - 3]);
        }
        return Math.max(nums[z - 1], nums[z - 2]);
    }

    public int rob2(int[] nums) {
        int n = nums.length;
        if (n < 1) {
            return 0;
        }
        int curr = 0, pre1 = 0, pre2 = 0;

        for (int i = 0; i < n; i++) {
            curr = Math.max(pre1 + nums[i], pre2);
            pre1 = pre2;
            pre2 = curr;
        }
        return curr;
    }

    @Test
    public void robTest() {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.print(rob2(nums));
    }
}
