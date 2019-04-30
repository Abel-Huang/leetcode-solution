package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/8/7
 * I should understand what is Longest Common Prefix.
 */
public class LongestCommonPrefix14 {
    public  String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLength = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0) {
                return "";
            } else {
                if (i == 0) {
                    minLength = strs[i].length();
                }
                if (strs[i].length() < minLength) {
                    minLength = strs[i].length();
                }
            }
        }
        for (int i = 0; i < minLength; i++) {
            char temp = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != temp) {
                    return sb.toString();
                }
            }
            sb.append(temp);
        }
        return sb.toString();
    }
}
