package cn.abelib.five;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-11 22:44
 * 注意二维矩阵，除法运算和取模运算
 */
public class ReshapeTheMatrix566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int len1 = nums.length;
        int len2 = nums[0].length;
        if (len1 * len2 != r * c || (len1 == r && len2 == c) || (len1 == len2 &&  r == c && len1 == r)) {
            return nums;
        }
        int[][] B = new int[r][c];
        for (int i = 0; i < len1 * len2; i ++) {
            int a, b, x, y;
            a = i % len2;
            b = i / len2;
            x = i % c;
            y = i / c;
            B[y][x] = nums[b][a];
        }
        return B;
    }

    @Test
    public void matrixReshapeTest() {
        int[][] nums = {{1,2,3, 4}};
        System.out.println(matrixReshape(nums, 2, 2));
    }
}
