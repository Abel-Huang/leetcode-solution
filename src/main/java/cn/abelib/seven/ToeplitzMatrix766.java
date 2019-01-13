package cn.abelib.seven;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-06 05:09
 */
public class ToeplitzMatrix766 {
    // todo
    public boolean isToeplitzMatrix(int[][] matrix) {
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        if (len1 == 1 || len2 == 1) {
            return true;
        }
        for (int i = len1 - 1; i >= 0; i ++) {
            for (int j = 0; j < len1 - i; j ++) {
                if (len1 - i < 1) {
                    continue;
                }
            }
        }
        return true;
    }

    @Test
    public void isToeplitzMatrixTest() {

    }
}
