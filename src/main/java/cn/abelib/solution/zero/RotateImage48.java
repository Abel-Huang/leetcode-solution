package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/7/21
 * find out the relative of indexes.
 */
public class RotateImage48 {
    public void rotate(int[][] matrix) {
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
