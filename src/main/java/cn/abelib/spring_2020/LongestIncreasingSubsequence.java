package cn.abelib.spring_2020;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2020-03-19 19:13
 */
public class LongestIncreasingSubsequence {
    /**
     * 找出最长上升子序列
     * @param nums
     * @return
     */
    public static int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];
        int len = 0;
        for (int num: nums) {
            int idx = Arrays.binarySearch(res, 0, len, num);
            idx = idx < 0? -idx - 1: idx;
            res[idx] = num;
            if (idx == len) {
                len++;
            }
        }
        return len;
    }

    /**
     * nums是新数组，i是索引，返回移除i位置元素后的数组
     * @param nums
     * @param i
     * @return
     */
    public static int[] newNum(int[] nums, int i) {
        int[] newNum = new int[nums.length - 1];
        int k = 0;
        for (int j = 0; j < nums.length; j++ ) {
            if (i != j) {
                newNum[k++] = nums[j];
            }
        }
        return newNum;
    }

    public static void main(String[] args) {
        int[] nums = {0,9,2,5,3,7,101,18};
        int max = 0;
        for (int i =0; i< nums.length; i++) {
            max = Math.max(max, lengthOfLIS(newNum(nums, i)));
            System.err.println(Arrays.toString(newNum(nums, i)));
            System.err.println(lengthOfLIS(newNum(nums, i)));
        }
        System.err.println(max);
    }
}
