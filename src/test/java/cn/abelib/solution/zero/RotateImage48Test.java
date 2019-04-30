package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


/**
 * @author abel.huang
 * @date 2019/4/30 15:55
 */
public class RotateImage48Test {
    private RotateImage48 rotateImage48;
    @Before
    public void init() {
        rotateImage48 = new RotateImage48();
    }

    @Test
    public void rotate() {
        int[][] nums = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        rotateImage48.rotate(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}