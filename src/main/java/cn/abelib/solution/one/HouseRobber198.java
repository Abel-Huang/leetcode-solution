package cn.abelib.solution.one;

/**
 *
 * @author abel-huang
 * @date 2016/8/1
 */
public class HouseRobber198 {
    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.print(rob(nums));
    }

    public static int rob(int[] nums) {
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
}
