package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

/**
 * @author abel.huang
 * @date 2019/4/30 15:06
 */
public class RemoveElement27Test {
    private RemoveElement27 reRemoveElement27;

    @Before
    public void init()  {
        reRemoveElement27 = new RemoveElement27();
    }

    @Test
    public void removeElement() {
        int nums[] = {3, 2, 2, 3};
        int val = 3;
        System.out.println(reRemoveElement27.removeElement(nums, val));
        int[] nums1 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val1 = 2;
        System.err.println(reRemoveElement27.removeElement(nums1, val1));
    }
}