package cn.abelib.solution.seven;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author abel
 * @date 2018/5/27
 * Accept 15.05%
 */
public class JewelsAndStones771 {
    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null) {
            return 0;
        }
        if (J.length() == 0 || S.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                sum++;
            }
        }
        return sum;
    }
}
