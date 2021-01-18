package cn.abelib.solution.one;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-08-22 20:53
 */
public class ReverseWordsInAString151 {
    public String reverseWords(String s) {
        String[] strs = s.trim().split(" ");
        int len = strs.length;
        if(len == 1) {
            return s.trim();
        }
        StringBuilder builder = new StringBuilder();
        for (int i = len - 1; i >= 0; i --) {
            if (strs[i].equals("")) {
                continue;
            }
            builder.append(strs[i]);
            if  (i != 0) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    @Test
    public void reverseWordsTest() {
        String s = "a    good   example";
        System.out.println(reverseWords(s));
    }
}
