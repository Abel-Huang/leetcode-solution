package cn.abelib.solution.nine;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-03-01 00:28
 */
public class NRepeatedElementInSize2NArray961 {
    public int repeatedNTimes(int[] A) {
        int[] nums = new int[10000];
        for(int i = 0; i < A.length; i++) {
            nums[A[i]] += 1;
            if (nums[A[i]] > 1) {
                return A[i];
            }
        }
        return 0;
    }

    @Test
    public void repeatedNTimesTest() {
        int[] nums = {1,2,3,3};
        System.out.println(repeatedNTimes(nums));
    }
}
