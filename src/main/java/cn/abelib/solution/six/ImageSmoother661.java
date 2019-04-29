package cn.abelib.solution.six;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-12 01:21
 */
public class ImageSmoother661 {
    // todo
    public int[][] imageSmoother(int[][] M) {
        if (M.length == 1 && M[0].length == 1) {
            return M;
        }
        if (M.length == 1 && M[0].length > 1) {
            int[][] N = new int[1][M[0].length];
            for (int i = 0; i < M[0].length; i ++) {
                if (i == 0) {
                    N[0][i] = (N[0][0] + N[0][1]) / 2;
                } else if (i == M[0].length - 1) {
                    N[0][i] = (N[0][M[0].length - 1] + N[0][M[0].length - 2]) / 2;
                } else {
                    N[0][i] = (N[0][i - 1] + N[0][i] + N[0][i + 1]) / 3;
                }
            }
            return N;
        }
        if (M.length > 1 && M[0].length == 1) {
            int[][] N = new int[M.length][1];
            for (int i = 0; i < M.length; i ++) {
                if (i == 0) {
                    N[i][0] = (N[i + 1][0] + N[i][0]) / 2;
                } else if (i == M.length - 1) {
                    N[i][0] = (N[M[0].length - 1][0] + N[M.length - 2][0]) / 2;
                } else {
                    N[i][0] = (N[i - 1][0] + N[i][0] + N[i + 1][0]) / 3;
                }
            }
            return N;
        }
        int[][] N = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (i == 0 && j == 0) {
                    N[i][j] = (M[i][j] + M[i][j + 1] + M[i + 1][j] + M[i + 1][j + 1]) / 4;
                } else if (i == M.length - 1 && j ==  M[0].length - 1) {
                    N[i][j] = (M[i][j] + M[i][j - 1] + M[i - 1][j] + M[i - 1][j - 1]) / 4;
                } else if (i == M.length - 1 && j == 0) {
                    N[i][j] = (M[i][j] + M[i][j + 1] + M[i - 1][j] + M[i - 1][j + 1]) / 4;
                } else if (i == 0 && j == M[0].length - 1) {
                    N[i][j] = (M[i][j] + M[i][j - 1] + M[i + 1][j] + M[i + 1][j - 1]) / 4;
                } else if (i == 0) {
                    N[i][j] = (M[i][j] + M[i][j - 1] + M[i][j + 1]
                            + M[i + 1][j - 1] + M[i + 1][j] + M[i + 1][j - 1]) / 6;
                } else if (j == 0) {
                    N[i][j] = (M[i - 1][j] + M[i][j] + M[i + 1][j]
                            + M[i - 1][j + 1] + M[i][j + 1] + M[i + 1][j + 1]) / 6;
                } else if (i == M.length - 1) {
                    N[i][j] = (M[i][j] + M[i][j - 1] + M[i][j + 1]
                            + M[i - 1][j - 1] + M[i - 1][j] + M[i - 1][j - 1]) / 6;
                } else if ( j == M[0].length - 1) {
                    N[i][j] = (M[i - 1][j] + M[i][j] + M[i + 1][j]
                            + M[i - 1][j - 1] + M[i][j - 1] + M[i + 1][j - 1]) / 6;
                } else {
                    N[i][j] = (M[i][j] + M[i][j - 1] + M[i][j + 1]
                            + M[i + 1][j - 1] + M[i + 1][j] + M[i + 1][j + 1]
                            + M[i - 1][j] + M[i - 1][j - 1] + M[i - 1][j + 1]) / 9;
                }
            }
        }
        return N;
    }

    @Test
    public void imageSmootherTest() {
        int[][] M = {{1,1, 0, 1}};
        System.out.println(imageSmoother(M));
    }
}
