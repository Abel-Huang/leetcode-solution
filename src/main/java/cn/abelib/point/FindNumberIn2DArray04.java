package cn.abelib.point;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2020-07-18 22:15
 */
public class FindNumberIn2DArray04 {
    public boolean findNumberIn2DArrayBySearch(int[][] matrix, int target) {
        int m = matrix.length;
        if (m < 1) {
            return false;
        }
        int n = matrix[0].length;
        if (n < 1) {
            return false;
        }
        for (int[] i : matrix) {
            int ans = Arrays.binarySearch(i, target);
            if (ans > -1) {
                return true;
            }
        }
        return false;
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        if (m < 1) {
            return false;
        }
        int n = matrix[0].length;
        if (n < 1) {
            return false;
        }

        return false;
    }
}
