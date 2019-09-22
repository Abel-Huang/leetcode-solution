package cn.abelib.solution.four;

import org.junit.Test;

import java.util.Arrays;


/**
 * @Author: abel.huang
 * @Date: 2019-09-22 14:40
 */
public class MinimumMovesToEqualArrayElements453 {
    public int minMoves(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return 0;
        }

        if (len == 2) {
            return Math.abs(nums[0] - nums[1]);
        }
        int cnt = 0;
        int min = Arrays.stream(nums).min().getAsInt();
        for (int i : nums) {
            cnt += i - min;
        }
        return cnt;
    }


    @Test
    public void minMovesTest() {
        int[] nums1 = {1,2,3, 4};
        System.err.println(minMoves(nums1));
        int[] nums2 = {1,2147483647};
        System.err.println(minMoves(nums2));
    }
}
