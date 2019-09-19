package cn.abelib.solution.seven;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-18 21:35
 */
public class PrimeNumberOfSetBitsInBinaryRepresentation762 {
    public int countPrimeSetBits(int L, int R) {
        int cnt = 0;
        for (int i = L; i <= R; i ++) {
            int num = Integer.bitCount(i);
            if (isPrime(num)) {
                cnt++;
            }
        }
        return cnt;
    }

    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        if (num < 4) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i ++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void countPrimeSetBitsTest() {
        int L = 6, R = 10;
        System.err.println(countPrimeSetBits(L, R));
    }
}
