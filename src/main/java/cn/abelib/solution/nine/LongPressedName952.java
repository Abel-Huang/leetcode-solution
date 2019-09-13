package cn.abelib.solution.nine;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-08 13:59
 */
public class LongPressedName952 {
    public boolean isLongPressedName(String name, String typed) {
        int len1 = name.length();
        int len2 = typed.length();
        if (len2 < 1 || len2 < len1) {
            return false;
        }
        if (name.equals(typed)) {
            return true;
        }
        int i = 0;
        int j = 0;
        while (true) {
            if (name.charAt(i) != typed.charAt(j)) {
                return false;
            }
            i ++;
            j ++;
            if (i == len1 || j == len2) {
                if (i == len1 && j == len2) {
                    return true;
                }
                if (j == len2 && i < len1) {
                    return false;
                }
                if (i == len1 && j < len2) {
                    for (int k = j; k < len2; k++) {
                        if (name.charAt(len1 - 1) != typed.charAt(k)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            while (typed.charAt(j) == typed.charAt(j -1) && name.charAt(i) != name.charAt(i -1)) {
                if (j == len2 - 1) {
                    return false;
                }
                j ++;

            }
        }
    }


    @Test
    public void mapTest() {
        String name1 = "pyplrz";
        String typed1 = "ppyypllrzl";
        System.err.println(isLongPressedName(name1, typed1));
        String name2 = "saeed";
        String typed2 = "ssaaedd";
        System.err.println(isLongPressedName(name2, typed2));
        String name3 = "leelee";
        String typed3 = "lleeelee";
        System.err.println(isLongPressedName(name3, typed3));
        String name4 = "kikcxmvzi";
        String typed4 = "kiikcxxmmvvzz";
        System.err.println(isLongPressedName(name4, typed4));
    }
}
