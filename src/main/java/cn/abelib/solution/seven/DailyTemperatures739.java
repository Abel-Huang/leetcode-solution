package cn.abelib.solution.seven;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2020-02-10 02:29
 */
public class DailyTemperatures739 {

    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j< len; j ++) {
                if (T[j] > T[i]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }

        return ans;
    }


    @Test
    public void test() {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        System.err.println(Arrays.toString(dailyTemperatures(T)));
    }
}
