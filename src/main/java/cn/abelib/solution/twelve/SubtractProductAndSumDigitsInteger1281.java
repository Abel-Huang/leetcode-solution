package cn.abelib.solution.twelve;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-02-01 00:45
 */
public class SubtractProductAndSumDigitsInteger1281 {
    public int subtractProductAndSum(int n) {
        if (n < 10) {
            return 0;
        }
        String nstr = String.valueOf(n);
        int sum = 0;
        int product = 1;
        for (char c : nstr.toCharArray()) {
            sum += c - '0';
            product *= c - '0';
        }
        return product - sum;
    }

    @Test
    public void subtractProductAndSumTest() {
        System.err.println(subtractProductAndSum(10000));
//        System.err.println(subtractProductAndSum(234));
//        System.err.println(subtractProductAndSum(9999));
    }
}
