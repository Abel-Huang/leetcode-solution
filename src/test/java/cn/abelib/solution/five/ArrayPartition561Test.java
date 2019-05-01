package cn.abelib.solution.five;

import org.junit.Before;
import org.junit.Test;


/**
 * @Author: abel.huang
 * @Date: 2019-04-30 23:00
 */
public class ArrayPartition561Test {
    private ArrayPartition561 arrayPartition561;

    @Before
    public void init() {
        arrayPartition561 = new ArrayPartition561();
    }

    @Test
    public void arrayPairSum() {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPartition561.arrayPairSum(nums));
    }
}