package cn.abelib.solution.five;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


/**
 * @Author: abel.huang
 * @Date: 2019-05-01 15:50
 */
public class ReshapeTheMatrix566Test {
    private ReshapeTheMatrix566 reshapeTheMatrix566;

    @Before
    public void init() {
        reshapeTheMatrix566 = new ReshapeTheMatrix566();
    }

    @Test
    public void matrixReshape() {
        int[][] nums = {{1,2,3, 4}};
        for (int[] numss : reshapeTheMatrix566.matrixReshape(nums, 2, 2)) {
            System.out.println(Arrays.toString(numss));
        }
    }
}