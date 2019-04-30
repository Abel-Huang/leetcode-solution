package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 11:30
 */
public class LongestCommonPrefix14Test {
    LongestCommonPrefix14 longestCommonPrefix14;

    @Before
    public void init() {
        longestCommonPrefix14 = new LongestCommonPrefix14();
    }

    @Test
    public void longestCommonPrefix() {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix14.longestCommonPrefix(strs));
        String[] strs1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix14.longestCommonPrefix(strs1));
    }
}