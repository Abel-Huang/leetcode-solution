package cn.abelib.five;

/**
 * @Author: abel.huang
 * @Date: 2019-03-11 23:31
 */
public class DetectCapital520 {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if (len < 2) {
            return true;
        }
        boolean result = true;
        for (int i = 1; i < len; i ++) {
            boolean tmp = word.charAt(i) - 'A' >= 0 && word.charAt(i) - 'A' < 26;
            if (i == 1) {
                if (tmp) {
                    result = true;
                } else {
                    result = false;
                }
                continue;
            }
            if (tmp) {
                result = result && true;
                if (!result) {
                   return false;
                }
            } else {
                result = result || false;
                if (result) {
                    return false;
                }
            }
        }
        return true;

    }
}
