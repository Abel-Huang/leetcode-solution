package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author abel.huang
 * @date 2019/4/30 13:40
 */
public class ThreeSum15Test {
    ThreeSum15 threeSum15;

    @Before
    public void init() {
        threeSum15 = new ThreeSum15();
    }

    @Test
    public void threeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum15.threeSum(nums).toString());
    }
}