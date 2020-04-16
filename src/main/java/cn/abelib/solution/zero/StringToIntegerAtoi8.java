package cn.abelib.solution.zero;

import org.junit.Test;

/**
 * @author abel.huang
 * @date 2019/4/30 11:29
 */
public class StringToIntegerAtoi8 {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() < 1) {
            return 0;
        }
        boolean posFlg = false;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            if (str.charAt(0) == '-') {
                posFlg = true;
            }
            str = str.substring(1);
        }
        if (str.length() < 1 || !validDigital(str.charAt(0))) {
            return 0;
        }
        int res = 0;
        for (char c : str.toCharArray()) {
            if (validDigital(c))  {
                int now = c - '0';
                if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && now >= 8)) {
                    return posFlg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                res = res * 10 + now;
            }else {
                break;
            }
        }
        return posFlg ? res * -1 : res;
    }

    private boolean validDigital(char c) {
        switch (c){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default:
                return false;
        }
    }


    @Test
    public void myAtoiTest() {
        System.err.println(myAtoi("  -42"));
        System.err.println(myAtoi("42"));
        System.err.println(myAtoi(" 4193 with words"));
        System.err.println(myAtoi("words and 987"));
        System.err.println(myAtoi("-91283472332"));
        System.err.println(myAtoi("91283472332"));
        System.err.println(myAtoi("-"));
        System.err.println(myAtoi("+"));
        System.err.println(myAtoi("+1"));
        System.err.println(myAtoi("-2147483647"));
        System.err.println(myAtoi("20000000000000000000"));
    }
}
