package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


/**
 * @author abel.huang
 * @date 2019/4/30 15:32
 */
public class NextPermutation31Test {
    private NextPermutation31 nextPermutation;

    @Before
    public void init() {
        nextPermutation = new NextPermutation31();
    }

    @Test
    public void swap() {
        int[] nums = {1, 2, 4, 3};
        nextPermutation.nextPermutation(nums);
        System.err.println(Arrays.toString(nums));
    }
}