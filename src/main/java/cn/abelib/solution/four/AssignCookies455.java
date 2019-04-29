package cn.abelib.solution.four;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 03:13
 */
public class AssignCookies455 {
    public int findContentChildren(int[] g, int[] s) {
        if (g.length < 1 || s.length < 1) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i = 0; i < g.length; i ++) {
            for (int j = i; j < s.length; j ++) {
                if (s[j] >= g[i]) {
                    count ++;
                    s[j] = 0;
                    break;
                }
            }
        }
        return count;
    }
}
