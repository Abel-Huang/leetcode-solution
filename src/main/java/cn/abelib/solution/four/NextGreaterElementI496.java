package cn.abelib.solution.four;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-12-01 23:31
 */
public class NextGreaterElementI496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1 < 1) {
            return new int[0];
        }
        int[] result = new int[len1];
        for (int i = 0; i < len1; i++) {
            int idx = -1;
            result[i] = - 1;
            for (int j = 0; j < len2; j++) {
               if (nums1[i] == nums2[j]) {
                   idx = j;
               }
            }
            if (idx == len2 - 1 || idx ==  -1) {
                continue;
            }
            for (int j = idx + 1; j < len2; j++) {
                if (nums1[i] < nums2[j]) {
                    result[i] = nums2[j];
                    break;
                }
            }
        }

        return result;
    }

    @Test
    public void nextGreaterElementTest() {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.err.println(Arrays.toString(nextGreaterElement(nums1, nums2)));

        int[] nums3 = {2, 4};
        int[] nums4 = {1, 2, 3, 4};
        System.err.println(Arrays.toString(nextGreaterElement(nums3, nums4)));
    }
}
