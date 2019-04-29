package cn.abelib.solution.zero;

/**
 * Created by abel-huang on 2016/8/7.
 * I should understand what is Longest Common Prefix.
 */
public class LeetCode_14 {
    public static void main(String args[]) {
        String strs[] = {"aab", "aabs", "aabab"};
        System.out.print(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int minLength = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0)
                return result;
            else {
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
                if (strs[j].charAt(i) != temp)
                    return result;
            }
            result += temp;
        }
        return result;
    }
}
