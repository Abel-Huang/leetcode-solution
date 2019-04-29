package cn.abelib.solution.two;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-03-01 00:03
 */
public class KthLargestElementInAnArray215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length -k];
    }
}
