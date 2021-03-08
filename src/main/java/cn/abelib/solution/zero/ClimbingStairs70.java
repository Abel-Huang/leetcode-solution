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
        int[] steps= new int[n];
        steps[0] = 1;
        steps[1] = 2;
        for (int i = 2; i < n; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n - 1];
    }

    public int climbStairs2(int n) {
        if (n <= 2) {
            return n;
        }
        int step1 = 1;
        int step2 = 2;
        int step3 = step2;
        for (int i = 2; i < n; i++) {
            step3 = step1 + step2;
            step1 = step2;
            step2 = step3;
        }
        return step3;
    }
}
