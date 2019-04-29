package cn.abelib.solution.seven;

import org.junit.Test;

import java.util.Arrays;


/**
 * @Author: abel.huang
 * @Date: 2019-01-08 15:43
 * TAG: 记录最大值的位置，然后排序，效率比较低
 */
public class LargestNumberAtLeastTwiceOfOthers747 {
    public int dominantIndex(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return 0;
        }
        int maxIndex = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }
        Arrays.sort(nums);
        if (nums[len - 1] >= nums[len - 2] * 2) {
           return maxIndex;
        }
        return -1;
    }

    @Test
    public void dominantIndexTest() {
        int[] nums = {4, 2, 1, 3};
        System.out.println(dominantIndex(nums));
    }
}
