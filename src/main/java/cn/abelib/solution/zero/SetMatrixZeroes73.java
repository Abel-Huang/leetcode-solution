package cn.abelib.solution.zero;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author abel-huang
 * @date 2016/7/22
 * But how to use constant time to solve this question?
 * I need more time to think of it.
 */
public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        if (matrix.length > 0 && matrix[0].length > 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        row.add(i);
                        col.add(j);
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (row.contains(i) || col.contains(j)) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
