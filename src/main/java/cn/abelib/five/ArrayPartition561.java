package cn.abelib.five;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-01-04 01:39
 * sort
 */
public class ArrayPartition561 {
    public int arrayPairSum(int[] nums) {
        if (nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }

    @Test
    public void arrayPairSumTest() {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
    }
}
