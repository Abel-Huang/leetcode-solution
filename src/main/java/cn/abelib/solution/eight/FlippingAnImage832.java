package cn.abelib.solution.eight;

import org.junit.Test;


/**
 * @Author: abel.huang
 * @Date: 2019-01-11 00:09
 * bit, two pointers
 */
public class FlippingAnImage832 {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A.length == 0) {
            return A;
        }

        if (A.length == 1 && A[0].length == 1){
            A[0][0] = ~A[0][0] + 2;
            return A;
        }

        for (int i = 0; i < A.length; i ++) {
            int left = 0;
            int right = A[i].length - 1;
            while (left < right) {
                int temp = A[i][left];
                A[i][left] = ~A[i][right] + 2;
                A[i][right] = ~temp + 2;
                left++;
                right--;
                if (right == left) {
                    A[i][left] =  ~ A[i][left] + 2;
                    break;
                }
                if (left > right) {
                    break;
                }
            }
        }
        return A;
    }

    @Test
    public void flipAndInvertImageTest() {
//        int[][] A = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
//        A = flipAndInvertImage(A);
//        for (int i = 0; i < 4; i ++) {
//            for (int j = 0; j < 4; j ++) {
//                System.out.print( A[i][j] + " ");
//            }
//            System.out.println();
//        }
        int[][] A = {{0}};
        A = flipAndInvertImage(A);
        System.out.println(A[0][0]);
    }
}
