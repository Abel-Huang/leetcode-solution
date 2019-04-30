package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/8/2
 * DP problems.
 */
public class ClimbingStairs70 {
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[]  steps= new int[n];
        steps[0] = 1;
        steps[1] = 2;
        for (int i = 2; i < n; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n - 1];
    }
}
