package cn.abelib.solution.two;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author abel-huang
 * @date 2016/7/30
 */
public class HappyNumber202 {
    public static boolean isHappy(int n) {
        String s = n + "";
        int sum;
        if (n == 1) {
            return true;
        }
        Set<Integer> set = new HashSet<>();
        while (true) {
            sum = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                sum += (s.charAt(i) - 48) * (s.charAt(i) - 48);
            }
            if (set.contains(sum)) {
                return sum == 1;
            }
            set.add(sum);
            s = sum + "";
        }
    }

    @Test
    public void isHappyTest() {
        int a = 7;
        System.out.print(" " + isHappy(a));
    }
}
