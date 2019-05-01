package cn.abelib.solution.two;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author abel-huang
 * @date 2016/7/30
 */
public class HappyNumber202 {
    public static void main(String args[]) {
        int a = 7;
        System.out.print(" " + isHappy(a));
    }

    public static boolean isHappy(int n) {
        String s = n + "";
        int sum = n;
        if (n == 1) {
            return true;
        }
        Map<Integer, Integer> hashMap = new HashMap<>();
        while (true) {
            sum = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                sum += (s.charAt(i) - 48) * (s.charAt(i) - 48);
            }
            if (!hashMap.containsKey(sum)) {
                hashMap.put(sum, sum);
            } else {
                break;
            }
            if (sum == 1) {
                break;
            }
            s = sum + "";
        }
        return sum == 1;
    }
}
