package cn.abelib.solution.two;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-15 14:24
 * 超时
 */
public class NumberOfDigitOne233 {
    public int countDigitOne2(int n) {
        if (n < 1) {
            return 0;
        }
        if (n < 10) {
            return 1;
        }
        int sum = 0;

        return sum;
    }


    public int countDigitOne(int n) {
        if (n < 1) {
            return 0;
        }
        if (n < 10) {
            return 1;
        }
        int sum = 0;
        for (int i = 1; i <= n; i ++) {
            sum += countOne(i);
        }
        return sum;
    }

    public int countOne(int n) {
        int count = 0;
        int remain;
        String counts = n + "";
        if (counts.indexOf("1") < 0) {
            return 0;
        }
        for (int i = 0; i < counts.length(); i ++) {
            if (counts.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    @Test
    public void test() {
        //824883294
        int n = 9000;
        System.err.println(countDigitOne(n));
    }
}
