package cn.abelib.solution.seven;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author abel
 * @date 2018/5/27
 * Accept 22.50%
 */
public class RotatedDigits788 {
    public static int rotatedDigits(int N) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(0, 1, 2, 5, 6, 8, 9));
        if (N == 1) {
            return 0;
        }
        String temp = null;
        int sum = 0;
        boolean flag = true;
        int result = 0;
        for (int i = 2; i <= N; i++) {
            temp = i + "";
            flag = true;
            result = 0;
            for (int j = 0; j < temp.length(); j++) {
                int a = temp.charAt(j) - 48;
                if (!set.contains(a)) {
                    flag = false;
                    break;
                }
                if (a == 0) {
                    a = 0;
                } else if (a == 1) {
                    a = 1;
                } else if (a == 2) {
                    a = 5;
                } else if (a == 5) {
                    a = 2;
                } else if (a == 6) {
                    a = 9;
                } else if (a == 8) {
                    a = 8;
                } else if (a == 9) {
                    a = 6;
                }
                result = a + result * 10;
            }
            if (flag && result != i) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.err.println(rotatedDigits(19));
//        System.err.println(rotatedDigits(19));
//        System.err.println(rotatedDigits(18));
//        System.err.println(rotatedDigits(17));
//        System.err.println(rotatedDigits(16));
    }
}
