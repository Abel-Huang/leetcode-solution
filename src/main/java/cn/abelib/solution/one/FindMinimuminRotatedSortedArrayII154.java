package cn.abelib.solution.one;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-07-22 21:57
 */
public class FindMinimuminRotatedSortedArrayII154 {
    /**
     二分法, 每次进入无序的那部分找出最小值,由于有重复值的情况,
     需要加入 mid 元素等于 right 元素的情况,
     此时应该将 right 减 1 防止重复数字是最小元素
     **/
    public int findMin(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        if (len < 1) {
            return 0;
        }
        int left = 0, right = len - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                right --;
            }
        }
        return nums[left];
    }

    @Test
    public void findMinTest() {
        System.err.println(findMin(new int[]{1, 3, 5}));

        System.err.println(findMin(new int[]{2, 2, 2, 0, 1}));

        System.err.println(findMin(new int[]{14,5,6,7,0,1,2}));
    }
}
