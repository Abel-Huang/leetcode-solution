package cn.abelib.solution.six;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2020-07-18 13:25
 * num取值范围 [0, 10^8]
 */
public class MaximumSwap670 {
    public int maximumSwap(int num) {
        if (num <= 11) {
            return num;
        }

        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }

        // [6, 3, 7, 2]
        int len = list.size();
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = list.get(i);
        }

        // [2, 3, 6, 7]
        Arrays.sort(a);

        for (int i = len -1; i >= 0;  i --) {
            if (a[i] != list.get(i)) {
                int now = list.get(i);
                int max = a[i];
                int idx = index(list, a[i]);

                list.set(i, max);
                list.set(idx, now);
                break;
            }
        }
        int ans = 0;
        for (int i = len -1; i >= 0;  i --) {
            ans = ans * 10 + list.get(i);
        }
        return ans;
    }

    private int index(List<Integer> list, int data) {
        for (int i = 0; i < list.size(); i++) {
            if (data == list.get(i)) {
                return i;
            }
        }
        return 0;
    }


    @Test
    public void maximumSwapTest() {
        System.err.println(maximumSwap(2736));
    }
}
