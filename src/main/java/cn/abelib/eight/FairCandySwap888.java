package cn.abelib.eight;


import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-07 13:32
 */
public class FairCandySwap888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < A.length; i++) {
            sum1 += A[i];
        }
        for (int i = 0; i < B.length; i++) {
            sum2 += B[i];
        }
        for (int i = 0; i < A.length; i ++) {
            for (int j = 0; j < B.length; j++) {
                if (sum1 + B[j] -A[i] == sum2 + A[i] - B[j]) {
                    return new int[]{A[i], B[j]};
                }
            }
        }
        return new int[]{0, 0};
    }

    @Test
    public void fairCandySwapTest() {
        int[] A = {1, 2};
        int[] B = {2, 3};
        System.out.println(fairCandySwap(A, B)[0] + " " + fairCandySwap(A, B)[1]);
    }
}
