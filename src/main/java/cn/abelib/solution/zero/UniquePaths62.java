package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/8/1
 *
 */
public class UniquePaths62 {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        int[][] total = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    total[i][j] = 1;
                } else {
                    total[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                total[i][j] = total[i - 1][j] + total[i][j - 1];
            }
        }
        return total[m - 1][n - 1];
    }
}
