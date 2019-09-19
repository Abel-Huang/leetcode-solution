package cn.abelib.solution.nine;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-09-15 18:34
 */
public class ValidMountainArray941 {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int max = Arrays.stream(A).max().getAsInt();
        int idx = -1;
        for (int i = 0; i < A.length; i ++) {
            if (A[i] == max) {
                idx = i;
                break;
            }
        }
        if (idx == 0 || idx == A.length - 1) {
            return false;
        }
        for (int i = 0; i < idx; i ++) {
            if (A[i] >= A[i + 1]) {
                return false;
            }
        }
        for (int i = idx; i < A.length - 1; i ++) {
            if (A[i] <= A[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void validMountainArrayTest() {
        int[] A = {0,3,2,1};
        System.err.println(validMountainArray(A));
        int[] A1 = {3,5,5};
        System.err.println(validMountainArray(A1));
    }
}
