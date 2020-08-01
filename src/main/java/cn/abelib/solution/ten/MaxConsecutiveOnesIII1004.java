package cn.abelib.solution.ten;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-07-23 20:53
 */
public class MaxConsecutiveOnesIII1004 {
    public int longestOnes(int[] A, int K) {
        int len = A.length;
        if (len == K) {
            return K;
        }
        int left = 0;
        int restK = K;
        int ans = 0;
        for (int i = 0; i < len; i ++) {
            if (A[i] == 1) {
                ans = Math.max(ans, i - left + 1);
            } else {
                if (restK > 0) {
                    restK --;
                    if (i > left) {
                        ans = Math.max(ans, i - left + 1);
                    }
                } else {
                    for (int j = left; j < i; j ++) {
                        if (A[j] == 0) {
                            left = j + 1;
                            break;
                        }
                    }
                }
            }
        }
        if (ans == 0) {
            return ans;
        }
        return K == 0 ? ans - 1 : ans;
    }

    @Test
    public void longestOnesTest() {
        System.err.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));

        System.err.println(longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));


        System.err.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 0));

        System.err.println(longestOnes(new int[]{0,0,0,0,0}, 0));
    }
}
