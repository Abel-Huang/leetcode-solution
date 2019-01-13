package cn.abelib.one;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-01-12 02:32
 */
public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (len < 2 || (k % len == 0)) {
            return;
        }
        int temp = 0;
        for (int i = 0; i <len; i ++ ) {
            if (nums[i] != nums[(i + k) % len]) {
                temp = nums[i];
                nums[i] = nums[(i + k) % len];
                nums[(i + k) % len] = temp;
            }
        }
    }

    @Test
    public void rotateTest(){
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        Arrays.stream(nums).forEach(System.out::println);
    }
}
