package cn.abelib.solution.thirteen;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-07-26 23:52
 */
public class CountNegativeNumbersinASortedMatrix1351 {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i ++) {
            for(int j = 0; j < n; j ++) {
                if(grid[i][j] < 0) {
                    ans += n - j;
                    break;
                }
            }
        }
        return ans;
    }

    @Test
    public void countNegativesTest() {
        int[][] matrix = new int[][]{{4,3,2,-1}, {13,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}};
        System.err.println(countNegatives(matrix));
    }
}
