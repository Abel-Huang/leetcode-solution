package cn.abelib.nine;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 00:27
 */
public class LargestPerimeterTriangle976 {
    public int largestPerimeter(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        for(int i = A.length - 3; i >= 0; i --) {
            int result = isValid(A[i], A[i + 1], A[i + 2]);
            if (result  > 0) {
                return result;
            }
        }
        return 0;
    }

    private int isValid(int s1, int s2, int s3) {
        return s3 < s2 + s1 ? s1 + s2 + s3 : 0;
    }
}
