package cn.abelib.zero;

import java.util.HashMap;

/**
 * Created by abel-huang on 2016/7/22.
 * But how to use constant time to solve this question?
 * I need more time to think of it.
 */
public class LeetCode_73 {
    public static void main(String args[]) {
        int nums[][] = {{1, 2, 0, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 0, 15, 16}};
        setZeroes(nums);
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                System.out.print(" " + nums[i][j]);
    }

    public static void setZeroes(int[][] matrix) {
        HashMap<Integer, Integer> row = new HashMap<>();
        HashMap<Integer, Integer> col = new HashMap<>();
        if (matrix.length > 0 && matrix[0].length > 0) {
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        row.put(new Integer(i), new Integer(i));
                        col.put(new Integer(j), new Integer(j));
                    }
                }
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[0].length; j++) {
                    if (row.containsKey(new Integer(i)) || col.containsKey(new Integer(j)))
                        matrix[i][j] = 0;
                }
        }

    }
}
