package cn.abelib.solution.one;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-01-13 00:07
 */
public class SurroundedRegions130 {
    int[] direction = {-1, 0, 1, 0, -1};

    public void solve(char[][] board) {
        int l1 = board.length;
        if (l1 < 1) {
            return;
        }
        int l2 = board[0].length;
        if (l2 < 1) {
            return;
        }
        for (int i = 0; i < l1; i ++) {
            if (board[i][0] == 'O') {
                board[i][0] = 'Y';
            }
            if (board[i][l2 - 1] == 'O') {
                board[i][l2 - 1] = 'Y';
            }
        }
        for (int i = 0; i < l2; i ++) {
            if (board[0][i] == 'O') {
                board[0][i] = 'Y';
            }
            if (board[l1 -1][i] == 'O') {
                board[l1 -1][i] = 'Y';
            }
        }

        for (int i = 0; i < l1; i ++) {
            for (int j = 0; j < l2; j ++) {
                if (board[i][j] == 'Y') {
                    dfs(board, i, j);
                }
            }
        }
        for (int i = 0; i < l1; i ++) {
            for (int j = 0; j < l2; j ++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
        for (int i = 0; i < l1; i ++) {
            for (int j = 0; j < l2; j ++) {
                if (board[i][j] == 'Y') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int x, int y) {
        int xx, yy;

        for (int i = 0; i < 4; i ++) {
            xx = x + direction[i];
            yy = y + direction[i + 1];
            if (xx >= 0 && xx < board.length && yy >= 0 && yy < board[0].length) {
                if (board[xx][yy] == 'O') {
                    board[xx][yy] = 'Y';
                    dfs(board, xx, yy);
                }
            }
        }
    }

    @Test
    public void solveTest() {
        char[][] grid = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','O','X'}};
        solve(grid);
    }
}
