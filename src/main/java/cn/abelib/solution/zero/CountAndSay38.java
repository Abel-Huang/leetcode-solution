package cn.abelib.solution.zero;

import org.junit.Test;

/**
 * Created by abel on 2018/9/22.
 */
public class CountAndSay38 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String lastResult = countAndSay(n - 1);
        StringBuilder builder = new StringBuilder();
        int idx = 1;
        char last = lastResult.charAt(0);
        for (int i = 1; i < lastResult.length(); i ++) {
            if (lastResult.charAt(i) != last) {
                builder.append(idx);
                builder.append(last);
                idx = 1;
                last = lastResult.charAt(i);
            } else {
               idx ++;
            }
        }
        builder.append(idx);
        builder.append(last);
        return builder.toString();
    }


    @Test
    public void countAndSayTest() {
        System.err.println(countAndSay(1));
        System.err.println(countAndSay(4));
        System.err.println(countAndSay(5));
        System.err.println(countAndSay(10));
    }
}
