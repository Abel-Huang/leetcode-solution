package cn.abelib.solution.eight;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 23:12
 */
public class TransposeMatrix867Test {
    private TransposeMatrix867 transposeMatrix867;

    @Before
    public void init() {
        transposeMatrix867 = new TransposeMatrix867();
    }

    @Test
    public void transpose() {
        int[][] A = {{1,2,3, 4}};
        for(int[] nums : transposeMatrix867.transpose(A)) {
            System.out.println(Arrays.toString(nums));
        }

    }
}