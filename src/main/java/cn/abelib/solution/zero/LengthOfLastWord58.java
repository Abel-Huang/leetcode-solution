package cn.abelib.solution.zero;

import java.lang.String;
import java.lang.System;

/**
 *
 * @author abel-huang
 * @date 2016/7/15
 * notes:how to pass these test cases like:" ","  ","a "," a"," a  " etc.
 */
public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        int rlength = 0;
        int tag = 0;
        if (s.length() == 0) {
            return 0;
        }
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
        return tag == 0 ? tag : rlength;
    }
}
