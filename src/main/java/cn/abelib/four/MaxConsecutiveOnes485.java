package cn.abelib.four;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-06 05:13
 * TAG: Array
 */
public class MaxConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 1) {
                cnt ++;
                continue;
            }
            if (cnt > max){
                max = cnt;
            }
            cnt= 0;
        }
        return Math.max(cnt, max);
    }

    @Test
    public void findMaxConsecutiveOnesTest() {
        int[] nums = {1, 1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
