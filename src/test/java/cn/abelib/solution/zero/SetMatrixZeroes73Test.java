package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


/**
 * @author abel.huang
 * @date 2019/4/30 16:53
 */
public class SetMatrixZeroes73Test {
    private SetMatrixZeroes73 setMatrixZeroes73;

    @Before
    public void init() {
        setMatrixZeroes73 = new SetMatrixZeroes73();
    }

    @Test
    public void setZeroes() {
        int[][] nums = {{1, 2, 0, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 0, 15, 16}};
        setMatrixZeroes73.setZeroes(nums);
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}