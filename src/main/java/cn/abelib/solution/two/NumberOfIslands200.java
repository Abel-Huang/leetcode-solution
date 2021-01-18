package cn.abelib.solution.two;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-01-12 23:25
 */
public class NumberOfIslands200 {
    int[] direction = {-1, 0, 1, 0, -1};

    public int numIslands(char[][] grid) {
        int l1 = grid.length;
        if (l1 < 1) {
            return 0;
        }
        int l2 = grid[0].length;
        if (l2 < 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < l1; i ++) {
            for (int j = 0; j < l2; j ++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count ++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int x, int y) {
        if (grid[x][y] == '0' || grid[x][y] == '2') {
            return;
        }
        grid[x][y] = '2';
        int xx, yy;
        for (int i = 0; i < 4; i ++) {
            xx = x + direction[i];
            yy = y + direction[i + 1];
            if (xx >= 0 && xx < grid.length && yy >= 0 && yy < grid[0].length) {
                dfs(grid, xx, yy);
            }
        }
    }
    
    @Test
    public void Test() {
        char[][] grid = {{'1','0','1','1','0','1','1'}};
        System.err.println(numIslands(grid));
        
    }
}
