package cn.abelib.six;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-01-06 05:27
 *  TAG:  需要考虑正数 负数 和零 的情况
 */
public class MaximumProductOfThreeNumbers628 {
    public int maximumProduct(int[] nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++){
            if (nums[i] < 0) {
                cnt1 ++;
            } else if (nums[i] == 0) {
                cnt2 ++;
            }else {
                break;
            }
        }
        cnt3 = len - cnt1 - cnt2;

        if (cnt3 > 2) {
            if (cnt1 > 1) {
                return Math.max(nums[len - 1] * nums[len -2 ] * nums[len -3], nums[0] * nums[1] * nums[len-1]);
            }
            return nums[len - 1] * nums[len -2 ] * nums[len -3];
        }
        if (cnt3 == 2) {
            if (cnt1 > 1) {
                return Math.max(nums[len - 1] * nums[1 ] * nums[0], nums[len - 1] * nums[len -2 ] * nums[len -3]);
            }
            if (cnt1 == 0) {
                return 0;
            }
            if (cnt2 > 0) {
                return 0;
            }
            return nums[cnt1] * nums[cnt1 + 1 ] * nums[cnt1 - 1];
        }
        if (cnt3 == 1) {
            if (cnt1 > 1){
                return nums[0] * nums[1] * nums[len - 1];
            }
            return 0;
        }
        if (cnt3 == 0) {
            if (cnt2 == 0) {
                return nums[len - 1] * nums[len - 2] * nums[len - 3];
            }
            return 0;
        }

        return nums[len - 1] * nums[len -2 ] * nums[len -3];
    }

    @Test
    public void maximumProductTest() {
        int[] nums = {-3, -4, 2, 3, 2, 0};
        System.out.println(maximumProduct(nums));
    }
}
