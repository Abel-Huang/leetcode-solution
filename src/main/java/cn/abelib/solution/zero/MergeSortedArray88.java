package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-01-09 00:49
 * 使用 Array.sort()
 */
public class MergeSortedArray88 {
    public void mergeWithSort(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i ++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1,0, m + n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = m -- + n -- - 1;
        while (m >= 0 && n >= 0) {
            nums1[pos --] = nums1[m] > nums2[n] ? nums1[m --] : nums2[n --];
        }
        while (n >= 0) {
            nums1[pos --] = nums2[n --];
        }
    }

    @Test
    public void mergeTest() {
        int m = 3, n = 3, pos =  m -- + n -- - 1;
        System.err.println(pos);
        System.err.println(m);
        System.err.println(n);
    }
}
