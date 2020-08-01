package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2020-07-26 20:34
 */
public class SearchA2DMatrix74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m < 1) {
            return false;
        }
        int n = matrix[0].length;
        if (n < 1) {
            return false;
        }
        for (int i = 0; i < m ; i ++) {
            if (matrix[i][0] > target) {
                return false;
            }
            if (matrix[i][n -1] < target) {
                continue;
            }
            int ans = Arrays.binarySearch(matrix[i], target);
            if (ans >= 0) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void searchMatrixTest() {
        int[][] matrix = new int[][]{{1,   3,  5,  7}, {10, 11, 16, 20}, {23, 30, 34, 50}};

        System.err.println(searchMatrix(matrix, 3));
    }

    @Test
    public void test() {
        System.err.println(Arrays.toString(new int[1][0]) );
    }
}
