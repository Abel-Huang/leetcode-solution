package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


/**
 * @author abel.huang
 * @date 2019/4/30 16:58
 */
public class SortColors75Test {
    private SortColors75 sortColors75;

    @Before
    public void init() {
        sortColors75 = new SortColors75();
    }

    @Test
    public void sortColors() {
        int[] nums = {2,0,2,1,1,0};
        sortColors75.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}