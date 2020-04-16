package cn.abelib.contest.biweekly_contest_19;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-02-08 22:35
 */
public class NumberOfSteps {
    int ans = 0;
    public int numberOfSteps (int num) {
        if (num == 0) {
            return ans;
        }
        if (num == 1) {
            return 1;
        }
        if (num % 2 == 0) {
            return numberOfSteps(num /2) + ans + 1;
        } else {
            return numberOfSteps(num - 1) + ans + 1;
        }

    }

    @Test
    public void numberOfStepsTest() {
        System.err.println(numberOfSteps(123));
        System.err.println(numberOfSteps(12312));
    }
}
