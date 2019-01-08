package cn.abelib.zero;

import java.util.List;

/**
 * Created by abel-huang on 2016/7/21.
 * find out the relative of indexes.
 */
public class LeetCode_48 {
    public static void main(String args[]) {
        int nums[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        rotate(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++)
                System.out.print(" " + nums[i][j]);
        }
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[] temp = new int[n * n];
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp[i * n + j] = matrix[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = temp[i + (n - j - 1) * n];
                }
            }
        }
    }
}
