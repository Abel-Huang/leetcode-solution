package cn.abelib.solution.zero;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-01-09 00:49
 * 使用 Array.sort()
 */
public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i ++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1,0, m + n);
    }
}
