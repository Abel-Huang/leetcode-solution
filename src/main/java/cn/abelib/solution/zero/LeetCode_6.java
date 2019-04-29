package cn.abelib.solution.zero;

/**
 * Created by abel-huang on 2016/7/9.
 */
public class LeetCode_6 {
    public static void main(String args[]) {
        String s = "AB";
        System.out.println(convert(s, 1));
    }

    public static String convert(String s, int numRows) {
        if (s.length() == 0)
            return "";
        if (numRows == 1)
            return s;
        String result = "";
        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                int k = 2 * (numRows - 1);
                for (int j = i; j < s.length(); j = j + k)
                    result += s.charAt(j);
            } else {
                int k = 2 * (numRows - 1 - i);
                for (int j = i; j < s.length(); j = j + k, k = 2 * (numRows - 1) - k) {
                    result += s.charAt(j);
                }
            }
        }
        return result;
    }
}
