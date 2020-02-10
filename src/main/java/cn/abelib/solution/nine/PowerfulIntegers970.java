package cn.abelib.solution.nine;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: abel.huang
 * @Date: 2020-01-06 22:18
 */
public class PowerfulIntegers970 {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> powers = new ArrayList<>();
        if (bound < 2) {
            return powers;
        }
        if (bound == 2 || (x == 1 && y == 1)) {
            powers.add(2);
            return powers;
        }

        Set<Integer> set = new HashSet<>();
        if (x == 1 || y == 1) {
            int temp;
            int xy = x * y;
            for (int i = 0; i <= bound; i ++) {
                temp = (int)Math.pow(xy, i);
                if (temp + 1> bound) {
                    break;
                }
                set.add(temp + 1);
            }
        }
        else {
            int temp;
            for (int i = 0; i <= bound; i ++) {
                temp = (int)Math.pow(x, i);
                if (temp > bound) {
                    break;
                }
                for (int j = 0; j <= bound; j ++) {
                    if (temp + (int)Math.pow(y, j) > bound) {
                        break;
                    }
                    set.add(temp + (int)Math.pow(y, j));
                }
            }
        }
        powers.addAll(set);
        return powers;
    }


    @Test
    public void powerfulIntegersTest() {
        int x = 2, y = 3, bound = 10;

        System.err.println(powerfulIntegers(x, y, bound));

        System.err.println(powerfulIntegers(90, 90, 10000));
        System.err.println(powerfulIntegers(1, 2, 10000));
        System.err.println(powerfulIntegers(1, 1, 10000));
    }
}
