package cn.abelib.solution.eight;


/**
 * @Author: abel.huang
 * @Date: 2019-01-07 13:32
 */
public class FairCandySwap888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i : A) {
            sum1 += i;
        }
        for (int i : B) {
            sum2 += i;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (sum1 + B[j] - A[i] == sum2 + A[i] - B[j]) {
                    return new int[]{A[i], B[j]};
                }
            }
        }
        return new int[]{0, 0};
    }
}
