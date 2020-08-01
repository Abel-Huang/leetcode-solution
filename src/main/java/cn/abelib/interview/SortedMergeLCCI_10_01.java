package cn.abelib.interview;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2020-07-25 16:26
 */
public class SortedMergeLCCI_10_01 {
    public void merge(int[] A, int m, int[] B, int n) {
        int len = A.length;
        if  (n < 1) {
            return;
        }
        for(int i = m; i < len; i ++) {
            A[i] = B[i - m];
        }
        Arrays.sort(A);
    }
}
