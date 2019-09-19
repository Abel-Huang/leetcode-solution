package cn.abelib.solution.one;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-16 22:02
 */
public class ExcelSheetColumnNumber171 {
    public int titleToNumber(String s) {
//        if (s.length() == 1) {
//            return s.charAt(0) - 'A' + 1;
//        }
//        if (s.length() == 2) {
//            return 26 * (s.charAt(0) - 'A' + 1) + s.charAt(1) - 'A' + 1;
//        }
        int len = s.length();
        int sum = 0;
        for (int i = len - 1; i >= 0; i --) {
            int temp = s.charAt(i) - 'A' + 1;
            for (int j = i; j < len - 1; j ++ ) {
                temp *= 26;
            }
            sum += temp;
        }
        return sum;
    }

    @Test
    public void titleToNumberTest() {
        String s = "A";
        System.err.println(titleToNumber(s));
        String s1 = "UM";
        System.err.println(titleToNumber(s1));
        String s2 = "ZZ";
        System.err.println(titleToNumber(s2));
        String s3 = "ZZZ";
        System.err.println(titleToNumber(s3));
    }
}
