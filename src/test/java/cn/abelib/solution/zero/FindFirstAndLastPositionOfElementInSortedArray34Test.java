package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author abel.huang
 * @date 2019/4/30 15:37
 */
public class FindFirstAndLastPositionOfElementInSortedArray34Test {
    private FindFirstAndLastPositionOfElementInSortedArray34 firstAndLastPositionOfElementInSortedArray34;

    @Before
    public void init() {
        firstAndLastPositionOfElementInSortedArray34 = new FindFirstAndLastPositionOfElementInSortedArray34();
    }

    @Test
    public void searchRange() {
        int[] nums = {3};
        int target = 8;
        int[] result = firstAndLastPositionOfElementInSortedArray34.searchRange(nums, target);
        System.out.print(Arrays.toString(result));
    }
}