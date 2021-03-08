package cn.abelib.solution.zero;

/**
 * @Author: abel.huang
 * @Date: 2020-08-01 16:43
 */
public class WordSearch79 {
    public boolean exist(char[][] board, String word) {
        int l1 = board.length;
        if (l1 < 1) {
            return false;
        }
        int l2 = board[0].length;
        if (l2 < 1) {
            return false;
        }
        for (int i = 0; i < l1; i ++) {
            for (int j = 0; j < l2; j ++) {
                if (board[i][j] == word.charAt(0)) {
                    return backtracking(board, i, j, word, 0);
                }
            }
        }
        return false;
    }

    private boolean backtracking(char[][] board, int x, int y, String word, int pos) {
        if (pos == word.length()) {
            return true;
        }
        return false;
    }
}
