package cn.abelib.solution.eight;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-09-15 23:38
 */
public class ShortestDistanceToACharacter821 {
    public int[] shortestToChar(String S, char C) {
        List<Integer> pos = new ArrayList<>();
        int[] result = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                pos.add(i);
            }
        }
        for (int i = 0; i < S.length(); i++) {
            result[i] = maxDis(pos, i);
        }
        return result;
    }

    public int maxDis(List<Integer> pos, int target) {
        int min = Math.abs(pos.get(0) - target);
        for (int i = 1; i < pos.size(); i++) {
            int temp = Math.abs(pos.get(i) - target);
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    @Test
    public void shortestToCharTest() {
        String S = "loveleetcode";
        char C = 'e';
        System.err.println(Arrays.toString(shortestToChar(S, C)) );
    }
}
