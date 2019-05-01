package cn.abelib.solution.eight;


/**
 * @Author: abel.huang
 * @Date: 2019-01-11 22:25
 */
public class TransposeMatrix867 {
    public int[][] transpose(int[][] A) {
        int len1 = A.length;
        int len2 = A[0].length;

        if (len1 == 1 && len2 == 1) {
            return A;
        }
        int[][] B = new int[len2][len1];
        for (int i = 0; i < len2; i ++){
            for (int j = 0; j < len1; j ++) {
                B[i][j] = A[j][i];
            }
        }
        return B;
    }
}
