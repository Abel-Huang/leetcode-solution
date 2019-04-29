package cn.abelib.solution.one;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author abel.huang
 * @date 2019/4/28 16:09
 */
public class RotateArray189Test {
    RotateArray189 rotateArray189;

    @Before
    public void init() {
        rotateArray189 = new RotateArray189();
    }


    @Test
    public void rotateTest(){
        int[] nums = {1,2,3,4,5,6,7};
        rotateArray189.rotate(nums, 3);
        Arrays.stream(nums).forEach(System.out::println);
    }
}
