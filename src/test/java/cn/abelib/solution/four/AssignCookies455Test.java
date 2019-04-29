package cn.abelib.solution.four;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 03:21
 */
public class AssignCookies455Test {
    AssignCookies455 assignCookies455;

    @Before
    public void init() {
        assignCookies455 = new AssignCookies455();
    }

    @Test
    public void findContentChildren() {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.err.println(assignCookies455.findContentChildren(g, s));
    }

    @Test
    public void findContentChildren2() {
        int[] g = {4,2,3};
        int[] s = {1,2};
        System.err.println(assignCookies455.findContentChildren(g, s));
    }
}