package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

/**
 * @author abel.huang
 * @date 2019/4/30 17:05
 */
public class RemoveDuplicatesFromSortedArrayii80Test {
    private RemoveDuplicatesFromSortedArrayii80 removeDuplicatesFromSortedArrayii80;

    @Before
    public void setUp() {
        removeDuplicatesFromSortedArrayii80 = new RemoveDuplicatesFromSortedArrayii80();
    }

    @Test
    public void removeDuplicates() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
        System.out.print(removeDuplicatesFromSortedArrayii80.removeDuplicates(nums));
    }
}