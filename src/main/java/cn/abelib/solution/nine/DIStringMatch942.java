package cn.abelib.solution.nine;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-05-01 19:55
 */
public class DIStringMatch942 {
    public int[] diStringMatch(String S) {
        int len = S.length();
        int[] result = new int[len + 1];
        int max = len;
        int min = 0;
        for (int i = 0; i < len; i ++) {
            if (S.charAt(i) == 'D') {
                result[i] = max;
                max --;
            } else {
                result[i] = min;
                min ++;
            }
        }
        result[len] = max;
        return result;
    }

    @Test
    public void diStringMatchTest() {
        String s1 = "IDID";
        System.err.println(Arrays.toString(diStringMatch(s1)));

        String s2 = "III";
        System.err.println(Arrays.toString(diStringMatch(s2)));

        String s3 = "DDI";
        System.err.println(Arrays.toString(diStringMatch(s3)));
    }
}
