package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author abel.huang
 * @date 2019/4/30 16:25
 */
public class PlusOne66Test {
    private PlusOne66 plusOne66;

    @Before
    public void init() {
        plusOne66 = new PlusOne66();
    }

    @Test
    public void plusOne() {
        int[] digits = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne66.plusOne(digits)));

    }
}