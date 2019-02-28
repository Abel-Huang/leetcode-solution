package cn.abelib.nine;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-03-01 00:11
 */
public class SquaresOfASortedArray977 {
    public int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
