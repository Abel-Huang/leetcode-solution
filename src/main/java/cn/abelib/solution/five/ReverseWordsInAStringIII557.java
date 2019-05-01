package cn.abelib.solution.five;

/**
 * @Author: abel.huang
 * @Date: 2019-05-01 18:54
 */
public class ReverseWordsInAStringIII557 {
    public String reverseWords(String s) {
        if (s.length() < 2) {
            return s;
        }
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i ++) {
            if (i != 0) {
                sb.append(" ");
            }
            sb.append(new StringBuilder(strs[i]).reverse().toString());
        }
        return sb.toString();
    }
}
