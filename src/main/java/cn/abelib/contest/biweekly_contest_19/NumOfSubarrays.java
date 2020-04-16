package cn.abelib.contest.biweekly_contest_19;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-02-08 23:22
 */
public class NumOfSubarrays {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = k * threshold;
        int len = arr.length;
        int ans = 0;
        for (int i = 0; i <= len - k; i++) {
            int total = 0;
            for (int j = i; j < i + k; j ++) {
                total += arr[j];
            }
            if (total >= sum) {
                ans ++;
            }
        }
        return ans;
    }

    @Test
    public void numOfSubarraysTest() {
        int[] arr1 = {2,2,2,2,5,5,5,8};
        System.err.println(numOfSubarrays(arr1, 3, 4));

        int[] arr2 = {1,1,1,1,1};
        System.err.println(numOfSubarrays(arr2, 1, 0));

        int[] arr3 = {11,13,17,23,29,31,7,5,2,3};
        System.err.println(numOfSubarrays(arr3, 3, 5));
    }
}
