package cn.abelib.solution.seven;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-09-22 16:17
 */
public class BinarySearch702 {
    public int search(int[] nums, int target) {
        int idx = Arrays.binarySearch(nums, target);
        return  idx < 0 ? -1 : idx;
    }

    @Test
    public void searchTest() {
        int[] nums1 = {-1, 2, 3, 5, 9, 12};
        int target1 = 2;
        System.err.println(search(nums1, target1));
    }

}
