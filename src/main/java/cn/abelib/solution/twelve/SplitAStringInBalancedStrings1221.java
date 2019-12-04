package cn.abelib.solution.twelve;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-12-04 21:43
 */
public class SplitAStringInBalancedStrings1221 {
    public int balancedStringSplit(String s) {
        int len = s.length();
        if (len < 2) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'L') {
                l++;
            }
            if (s.charAt(i) == 'R') {
                r++;
            }
            if (l == r) {
                l = 0;
                r = 0;
                cnt++;
            }
        }
        return cnt;
    }

    @Test
    public void balancedStringSplitTest() {
        String s1 = "RLRRLLRLRL";
        System.err.println(balancedStringSplit(s1));
        String s2 = "RLLLLRRRLR";
        System.err.println(balancedStringSplit(s2));
        String s3 = "LLLLRRRR";
        System.err.println(balancedStringSplit(s3));
    }
}
