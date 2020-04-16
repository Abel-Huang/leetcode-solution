package cn.abelib.contest.weekly_contest_177;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2020-02-24 01:47
 */
public class ClosestDivisors5171 {
    public int[] closestDivisors(int num) {
        int max1 = getMaxDivisor(num, 1);
        int min1 = (num + 1) / max1;

        int max2 = getMaxDivisor(num, 2);
        int min2 = (num + 2) / max2;

        if (Math.abs(max1 - min1) >= Math.abs(max2 - min2)) {
            return new int[]{max2, min2};
        } else {
            return new int[]{max1, min1};
        }
    }

    private int getMaxDivisor(int num, int addition) {
        num += addition;
        int limit = (int) Math.sqrt(num);
        for (int i = limit; i >= 1; i --) {
            if (num % i == 0) {
                return i;
            }
        }
        return 1;
    }


    @Test
    public void test() {
        System.err.println(Arrays.toString(closestDivisors(8)));
        System.err.println(Arrays.toString(closestDivisors(999)));
    }
}
