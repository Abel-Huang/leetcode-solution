package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

/**
 * @author abel.huang
 * @date 2019/4/30 14:19
 */
public class RemoveDuplicatesFromSortedArray26Test {
    RemoveDuplicatesFromSortedArray26 removeDuplicatesFromSortedArray26;

    @Before
    public void init() {
        removeDuplicatesFromSortedArray26 = new RemoveDuplicatesFromSortedArray26();
    }

    @Test
    public void removeDuplicates() {
        int[] nums = {1, 1, 2, 2, 3, 3};
        System.out.println(removeDuplicatesFromSortedArray26.removeDuplicates(nums));
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicatesFromSortedArray26.removeDuplicates(nums));
    }
}