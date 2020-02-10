package cn.abelib.solution.seven;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2020-02-10 02:29
 */
public class DailyTemperatures739 {
    public int[] dailyTemperatures1(int[] T) {
        int len = T.length;
        int[] ans = new int[len];
        List<List<Integer>> cache = new ArrayList<>(71);
        for (int i = 0; i < 71; i++) {
            cache.add(new ArrayList<>());
        }
        for (int i = 0; i < len; i++) {
            cache.get(T[i] - 30).add(i);
        }
        for (int i = 0; i < len; i ++) {
            boolean flag = false;
            for (int j = T[i] - 30 + 1; j < 71; j++) {
               for(int k : cache.get(j)) {
                   if (k > i) {
                       ans[i] = k - i;
                       flag = true;
                       break;
                   }
               }
               if (flag) {
                   break;
               }
            }

        }
        System.err.println(cache);
        return ans;
    }

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
