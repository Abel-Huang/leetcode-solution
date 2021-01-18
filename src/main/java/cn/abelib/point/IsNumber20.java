package cn.abelib.point;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: abel.huang
 * @Date: 2020-10-22 21:56
 *  todo
 *  + 只能位于第一位, 且只能有一个
 *  - 可以位于第一位，也可以位于E, e后面一位
 *  . 只能有一个，且前后必须是数字，且不能位于首尾
 *  E/e 只能有一个，前面必须是数字，后面可以为数字和 -
 */
public class IsNumber20 {

    char plus = '+';
    char minus = '-';
    char e1 = 'e';
    char e2 = 'E';
    char point = '.';
    Set<Character> set = new HashSet<>();

    public boolean isNumber1(String s) {
        int len = s.length();
        if (len < 1) {
            return false;
        }
        set.add('0');
        set.add('1');
        set.add('2');
        set.add('3');
        set.add('4');
        set.add('5');
        set.add('6');
        set.add('7');
        set.add('8');
        set.add('9');
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == plus && i != 0) {
                return false;
            }
            if (s.charAt(i) == minus) {
                if (i == 0) {
                    continue;
                }
                if (i == len - 1) {
                    return false;
                }
                if (!set.contains(s.charAt(i + 1))) {
                    return false;
                }
                if (!set.contains(s.charAt(i - 1)) || s.charAt(i - 1) != e1 || s.charAt(i - 1) != e2) {
                    return false;
                }
            }
            if (s.charAt(i) == minus) {

            }
        }
        return true;
    }

    public boolean isNumber2(String s) {
        try {
            char ch = s.charAt(s.length()-1);
            if(ch == 'f'|| ch == 'D') {
                return false;
            }
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
