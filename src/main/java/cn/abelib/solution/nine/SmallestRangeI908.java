package cn.abelib.solution.nine;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-09-15 14:14
 */
public class SmallestRangeI908 {
    public int smallestRangeI(int[] A, int K) {
        int len = A.length;
        if (len < 2) {
            return 0;
        }
        Arrays.sort(A);
        int dis = A[len - 1] - A[0];
        if (K == 0) {
            return dis;
        }

        if (dis <= K * 2) {
            return 0;
        }
        return dis - K * 2;
    }

    @Test
    public void smallestRangeITest() {
        int[] A = {0, 10};
        int K = 2;
        System.err.println(smallestRangeI(A, K));
    }
}
