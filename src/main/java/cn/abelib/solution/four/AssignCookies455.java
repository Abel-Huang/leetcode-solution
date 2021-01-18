package cn.abelib.solution.four;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 03:13
 *  分发饼干
 *  贪心算法，用最小的能满足需求的饼干，优先喂给需求最小的
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
                    break;
                }
            }
        }
        return count;
    }


    @Test
    public void findContentChildren() {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.err.println(findContentChildren(g, s));
    }

    @Test
    public void findContentChildren2() {
        int[] g = {4,2,3};
        int[] s = {1,2};
        System.err.println(findContentChildren(g, s));
    }

    @Test
    public void findContentChildren3() {
        int[] g = {1,2};
        int[] s = {1,2, 3};
        System.err.println(findContentChildren(g, s));
    }
}
