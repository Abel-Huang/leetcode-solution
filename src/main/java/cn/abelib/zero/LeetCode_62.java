package cn.abelib.zero;

/**
 * Created by abel-huang on 2016/8/1.
 * This is a typical DP problem,  total[i][j]=total[i-1][j]+total[i][j-1], means
 * because we can only move down and right, the total is the result, but we should
 * be careful of all the bound of the array is 1, because we can only follow one way
 * to achieve the site.
 */
public class LeetCode_62 {
    public static void main(String args[]) {
        int m = 2, n = 3;
        System.out.print(uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        if (m == 1 || n == 1)
            return 1;
        int total[][] = new int[m][n];
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
