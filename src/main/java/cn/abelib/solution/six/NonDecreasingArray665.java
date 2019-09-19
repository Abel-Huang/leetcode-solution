package cn.abelib.solution.six;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-15 16:02
 */
public class NonDecreasingArray665 {
    public boolean checkPossibility(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return true;
        }
        int idx = -1;
        int pre;
        for (int i = 1; i < len; i ++) {
            pre = nums[i - 1];
            if (nums[i - 1] > nums[i]) {
                if (pre > nums[i] && i != 1) {
                    return false;
                }
                if (idx < 0) {
                    idx = i;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkPossibility2(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return true;
        }
        int idx = -1;
        for (int i = 0; i < len - 1; i ++) {
            if (nums[i] > nums[i + 1]) {
                if (idx < 0) {
                    idx = i;
                } else {
                    return false;
                }
            }
        }
        if (idx <= 0) {
            return true;
        }
        if (idx + 2  >=  len) {
            return true;
        }
        int max = nums[idx];
        boolean flag1 = true;
        for (int i = idx + 2; i < len; i++) {
            if (nums[i] < max) {
                flag1 = false;
            }
        }
        if (flag1) {
            return true;
        }
        boolean flag2 = true;
        int min = nums[idx - 1];
        for (int i = idx + 1; i < len; i++) {
            if (nums[i] < min) {
                flag2 = false;
            }
        }
        if (flag2) {
            return true;
        }
        return false;
    }


    @Test
    public void checkPossibilityTest() {
        int[] nums = {2, 3, 3, 2, 4};
        System.err.println(checkPossibility2(nums));
        int[] num2 = {3, 4, 2, 3};
        System.err.println(checkPossibility2(num2));
        int[] num3 = {4, 2, 1};
        System.err.println(checkPossibility2(num3));
        int[] num4 = {-1, 4, 2, 3};
        System.err.println(checkPossibility2(num4));
        int[] num5 = {1, 2, 3};
        System.err.println(checkPossibility2(num5));
        int[] num6 = {4, 2, 3};
        System.err.println(checkPossibility2(num6));
    }
}
