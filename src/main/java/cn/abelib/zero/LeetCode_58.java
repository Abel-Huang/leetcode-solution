package cn.abelib.zero;

import java.lang.String;
import java.lang.System;

/**
 * Created by abel-huang on 2016/7/15.
 * notes:how to pass these test cases like:" ","  ","a "," a"," a  " etc.
 */
public class LeetCode_58 {
    public static void main(String args[]) {
        String s = " a  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int rlength = 0;
        int tag = 0;
        if (s.length() == 0)
            return 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != 32) {
                tag = 1;
                rlength++;
            } else {
                if (tag == 1 && s.charAt(i) == 32) {
                    break;
                }
            }
        }
        if (tag == 0)
            return 0;
        else
            return rlength;
    }
}
