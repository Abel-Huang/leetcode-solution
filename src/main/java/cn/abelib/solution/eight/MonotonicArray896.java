package cn.abelib.solution.eight;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-07 10:16
 * TAG: 需要考虑数组是递增还是递减
 */
public class MonotonicArray896 {
    public boolean isMonotonic(int[] A) {
        if (A.length < 2) {
            return true;
        }
        if (A[0] > A[A.length - 1]) {
            for (int i = 1; i < A.length; i++) {
                if (A[i] > A[i - 1]) {
                    return false;
                }
            }
            return true;
        }
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void isMonotonicTest() {
        int[] A = {6, 6, 1};
        System.out.println(isMonotonic(A));
    }
}
