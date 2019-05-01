package cn.abelib.solution.eight;


/**
 * @Author: abel.huang
 * @Date: 2019-05-01 23:22
 */
public class PeakIndexInAMountainArray852 {
    public int peakIndexInMountainArray(int[] A) {
        if (A.length < 3) {
            return -1;
        }
        int max = 0;
        for (int i = 1; i < A.length; i ++) {
           if (A[i] > A[max]) {
               max = i;
           }
        }
        if (max == 0 || A.length - 1 == max) {
            return -1;
        }
        for (int i = 0; i < max; i++) {
            if (A[i] > A[i + 1]) {
                return -1;
            }
        }
        for (int i = A.length - 1; i > max; i--) {
            if (A[i] > A[i - 1]) {
                return -1;
            }
        }
        return max;
    }
}
