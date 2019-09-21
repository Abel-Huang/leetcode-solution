package cn.abelib.solution.eight;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-21 14:47
 */
public class BinaryGap868 {
    public int binaryGap(int N) {
        String nStr = Integer.toBinaryString(N);
        if (nStr.length() < 2) {
            return 0;
        }
        int max = 0;
        int preIdx = -1;
        for (int i = 0; i < nStr.length(); i ++) {
            if (preIdx < 0 && nStr.charAt(i) == '1') {
                preIdx = i;
                continue;
            }
            if (nStr.charAt(i) == '1') {
                max = Math.max(max, i - preIdx);
                preIdx = i;
            }
        }
        return max;
    }

    @Test
    public void binaryGapTest() {
        System.err.println(binaryGap(22));
        System.err.println(binaryGap(5));
        System.err.println(binaryGap(6));
        System.err.println(binaryGap(8));
    }
}
