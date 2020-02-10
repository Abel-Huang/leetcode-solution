package cn.abelib.solution.three;

import org.junit.Test;

/**
 *
 * @author abel-huang
 * @date 2016/7/5
 */
public class ReverseString344 {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        char[] temp = new char[s.length()];
        String result;
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            temp[i] = chars[j];
        }
        result = new String(temp);
        return result;
    }

    /**
     * @param s
     */
    public void reverseString(char[] s) {
        int len = s.length;
        if (len < 2) {
            return;
        }
        char temp;
        for (int i = 0, j = len - i -1; i < len / 2; i++) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    private void reverseString2(char[] str) {
        helper(0, str.length - 1, str);
        System.err.println(new String(str));
    }

    private void helper(int start, int end, char [] str) {
        if (str == null || start >= str.length || end <= start || end < 0) {
            return;
        }
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        helper(start + 1, end - 1, str);
    }

    @Test
    public void reverseStringTest() {
        String s = "Hannah";
        reverseString2(s.toCharArray());
    }
}
