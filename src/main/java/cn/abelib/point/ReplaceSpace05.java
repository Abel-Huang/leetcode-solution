package cn.abelib.point;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-07-19 15:50
 */
public class ReplaceSpace05 {
    public String replaceSpaceWithReplaceAll(String s) {
        if  (s.length() < 1) {
            return "";
        }
        return s.replaceAll(" ", "%20");
    }

    public String replaceSpace(String s) {
        if  (s.length() < 1) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == 32){
                ans.append("%20");
            } else {
                ans.append(c);
            }

        }
        return ans.toString();
    }

    @Test
    public void replaceSpaceTest() {
        System.err.println(replaceSpace("We are     happy."));
    }
}
