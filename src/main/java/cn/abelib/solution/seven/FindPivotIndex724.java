package cn.abelib.solution.seven;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-01-09 00:18
 */
public class FindPivotIndex724 {
    public int pivotIndex1(int[] nums) {
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

    public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        if (len == 1) {
            return 0;
        }
        int total = 0;
        for (int i = 0; i < len; i++) {
            if (total * 2 + nums[i] == sum) {
                return i;
            }
            total += nums[i];
        }
        return -1;
    }

    @Test
    public void pivotIndexTest() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.err.println(pivotIndex(nums));
        int[] nums1 = {1, 2, 3};
        System.err.println(pivotIndex(nums1));
        int[] nums2 = {-1,-1,-1,0,1,1};
        System.err.println(pivotIndex(nums2));
    }
}
