package cn.abelib.solution.six;

/**
 * @Author: abel.huang
 * @Date: 2021-01-12 22:34
 */
public class MaxAreaOfIsland695 {
    int[] direction = {-1, 0, 1, 0, -1};

    public int maxAreaOfIsland(int[][] grid) {
        int l1 = grid.length;
        if (l1 < 1) {
            return 0;
        }
        int l2 = grid[0].length;
        if (l2 < 1) {
            return 0;
        }
        int maxArea = 0;
        for (int i = 0; i < l1; i ++) {
            for (int j = 0; j < l2; j ++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int x, int y) {
        if (grid[x][y] == 0) {
            return 0;
        }
        grid[x][y] = 0;
        int area = 1;
        int xx, yy;
        for (int i = 0; i < 4; i ++) {
            xx = x + direction[i];
            yy = y + direction[i + 1];
            if (xx >= 0 && xx < grid.length && yy >= 0 && yy < grid[0].length) {
                area += dfs(grid, xx, yy);
            }
        }
        return area;
    }
}
