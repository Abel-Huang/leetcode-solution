package cn.abelib.solution.three;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-01-19 21:51
 */
public class RangeSumQuery303 {
    class NumArray {
        int[] data;
        int[] temp;
        public NumArray(int[] nums) {
            temp = Arrays.copyOf(nums, nums.length);
            data = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    data[0] = 0;
                    continue;
                }
                data[i] = data[i - 1] + nums[i - 1];
            }
        }

        public int sumRange(int i, int j) {
            if (j < i) {
                return -1;
            }
            if (j == i) {
                return temp[i];
            }
            return data[j] - data[i] + temp[j];
        }
    }


    @Test
    public void test() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray array = new NumArray(nums);
        System.out.println( array.sumRange(0,5));
    }
}
