package cn.abelib.solution.zero;

/**
 * @Author: abel.huang
 * @Date: 2020-08-23 15:58
 */
public class ValidSudoku36 {
    /**
     * todo
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        int len = 9;
        if (board.length != len || board[0].length != len) {
            return false;
        }

        return false;
    }

    private boolean isValid(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9) {
        int[] nums = new int[9];
        if (nums[num1 - 1] != 0) {
            return false;
        } else {
            nums[num1 - 1] = 1;
        }
        if (nums[num2 - 1] != 0) {
            return false;
        } else {
            nums[num2 - 1] = 1;
        }
        if (nums[num3 - 1] != 0) {
            return false;
        } else {
            nums[num3 - 1] = 1;
        }
        if (nums[num4 - 1] != 0) {
            return false;
        } else {
            nums[num4 - 1] = 1;
        }
        if (nums[num5 - 1] != 0) {
            return false;
        } else {
            nums[num5 - 1] = 1;
        }
        if (nums[num6 - 1] != 0) {
            return false;
        } else {
            nums[num6 - 1] = 1;
        }
        if (nums[num7 - 1] != 0) {
            return false;
        } else {
            nums[num7 - 1] = 1;
        }
        if (nums[num8 - 1] != 0) {
            return false;
        } else {
            nums[num8 - 1] = 1;
        }
        if (nums[num9 - 1] != 0) {
            return false;
        }
        return true;
    }
}
