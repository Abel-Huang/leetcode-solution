package cn.abelib.explore.set;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


/**
 * @author abel.huang
 * @date 2019/5/5 8:55
 */
public class HowToUseSet1Test {
    private HowToUseSet1 howToUseSet1;

    @Before
    public void init() {
        howToUseSet1 = new HowToUseSet1();
    }

    @Test
    public void intersection() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {1, 2};
        Arrays.stream(howToUseSet1.intersection(nums1, nums2)).forEach(System.out::println);
    }
}