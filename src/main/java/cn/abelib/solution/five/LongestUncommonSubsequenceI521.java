package cn.abelib.solution.five;

/**
 * @Author: abel.huang
 * @Date: 2019-09-20 22:29
 *
 */
public class LongestUncommonSubsequenceI521 {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
