package cn.abelib.solution.four;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2021-02-22 22:59
 */
public class ArithmeticSlices413 {
    public int numberOfArithmeticSlices(int[] A) {
        int n = A.length;

        if (n < 2) {
            return 0;
        }

        int[] dp = new int[n];
        for (int i = 2; i < n; i ++) {
            if (A[i - 1] - A[i - 2] == A[i] - A[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        return Arrays.stream(dp).reduce(0, Integer::sum);
    }

    @Test
    public void numberOfArithmeticSlicesTest() {
        int[] A = {1, 2, 3, 4, 5};
        System.err.println(numberOfArithmeticSlices(A));
    }
}
