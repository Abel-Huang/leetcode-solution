package cn.abelib.zero;

import java.lang.String;
import java.lang.System;

/**
 * Created by abel-huang on 2016/8/2.
 * DP problems.
 */
public class LeetCode_70 {
    public static void main(String args[]) {
        int a = 4;
        System.out.println(climbStairs(a));
    }

    public static int climbStairs(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else {
            int steps[] = new int[n];
            steps[0] = 1;
            steps[1] = 2;
            for (int i = 2; i < n; i++)
                steps[i] = steps[i - 1] + steps[i - 2];
            return steps[n - 1];
        }
    }
}
