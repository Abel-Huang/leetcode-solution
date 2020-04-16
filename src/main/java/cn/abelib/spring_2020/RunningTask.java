package cn.abelib.spring_2020;

/**
 * @Author: abel.huang
 * @Date: 2020-03-19 19:56
 */
public class RunningTask {
    public static int num(int n, int m, int s, int[][] nums, int k) {
        int sum =0;
        for (int i = 0; i < m; i ++) {
            sum += nums[2][i];
        }
        if (sum < k) {
            return 0;
        }
        int[][] dp = new int[n][n];
        for (int i = 0; i < m; i ++) {
            dp[nums[0][i]][nums[1][i]] = nums[2][i];
        }
        return 0;
    }
}
