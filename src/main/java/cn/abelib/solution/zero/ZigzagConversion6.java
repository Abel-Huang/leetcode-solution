package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/7/9
 */
public class ZigzagConversion6 {
    public String convert(String s, int numRows) {
        if (s.length() == 0) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                int k = 2 * (numRows - 1);
                for (int j = i; j < s.length(); j = j + k) {
                    sb.append(s.charAt(j));
                }
            } else {
                int k = 2 * (numRows - 1 - i);
                for (int j = i; j < s.length(); j = j + k, k = 2 * (numRows - 1) - k) {
                    sb.append(s.charAt(j));
                }
            }
        }
        return sb.toString();
    }
}
