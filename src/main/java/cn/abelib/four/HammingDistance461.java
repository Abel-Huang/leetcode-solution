package cn.abelib.four;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-07 11:56
 * TAG: array
 */
public class HammingDistance461 {
    public int hammingDistance(int x, int y) {
        String maxStr = Integer.toBinaryString(Math.max(x, y));
        String minStr = Integer.toBinaryString(Math.min(x, y));
        int max = maxStr.length();
        int min = minStr.length();
        int cnt = 0;
        for (int i = 0; i < min; i++) {
            if (minStr.charAt(i) != maxStr.charAt(i + max - min)) {
                cnt++;
            }
        }
        for (int i = 0; i < max - min; i++) {
            if (maxStr.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }

    @Test
    public void hammingDistanceTest() {
        int x = 3;
        int y = 4;
        System.out.println(hammingDistance(x, y));
    }
}
