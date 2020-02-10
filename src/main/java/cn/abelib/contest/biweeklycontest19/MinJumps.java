package cn.abelib.contest.biweeklycontest19;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2020-02-08 23:37
 */
public class MinJumps {
    public int minJumps(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return 0;
        }
        if (len == 2) {
            return 1;
        }

        int ans = 0;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (arr[i] == arr[j]) {
                    dp[i][j] = 1;
                }
            }
        }


        for (int i = 0; i < len; i++) {
            System.err.println(Arrays.toString(dp[i]));
        }

        return 0;

    }

    @Test
    public void minJumpsTest() {
        int[] arr = {100,-23,-23,404,100,23,23,23,3,404};
        minJumps(arr);
    }
}
