package cn.abelib.solution.four;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2021-03-03 23:07
 * 不选择 nums[i]，如果在 [0, i - 1] 这个子区间内已经有一部分元素，使得它们的和为 j ，那么 dp[i][j] = true；
 * 选择 nums[i]，如果在 [0, i - 1] 这个子区间内就得找到一部分元素，使得它们的和为 j - nums[i]
 *
 */
public class PartitionEqualSubsetSum416 {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return false;
        }

        int sum = Arrays.stream(nums).sum();
        if ((sum & 1) == 1) {
            return false;
        }
        int target = sum / 2 ;
        boolean[][] dp = new boolean[len + 1][target + 1];

        for (int i = 0; i <= len; i ++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= len; i++) {
            for (int j = nums[i - 1]; j <= target; j ++) {
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
            }
        }
        return dp[len][target];
    }

    @Test
    public void canPartitionTest() {
        int[] nums = {9,1,2,4,10};
        System.err.println(canPartition(nums));
    }
}
