package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 16:19
 */
public class MinimumPathSum64Test {
    private MinimumPathSum64 minimumPathSum64;
    @Before
    public void init() {
        minimumPathSum64 = new MinimumPathSum64();
    }

    @Test
    public void minPathSum() {
        int[][] grid = {{1, 2}, {5, 6}, {1, 1}};
        System.out.println(minimumPathSum64.minPathSum(grid));
    }
}