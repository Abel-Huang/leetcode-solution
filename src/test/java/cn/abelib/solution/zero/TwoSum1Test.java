package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


/**
 * @author abel.huang
 * @date 2019/4/30 10:51
 */
public class TwoSum1Test {
    TwoSum1 twoSum1;

    @Before
    public void init() {
        twoSum1 = new TwoSum1();
    }

    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum1.twoSum(nums,target)));
    }
}