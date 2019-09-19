package cn.abelib.solution.five;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: abel.huang
 * @Date: 2019-09-19 21:47
 */
public class DistributeCandies575 {
    public int distributeCandies(int[] candies) {
        int len = candies.length;

        if (len == 2) {
            return 1;
        }

        Set<Integer> set = new HashSet<>();
        for (Integer i : candies) {
            set.add(i);
        }
        int size = set.size();
        if (size >= len / 2) {
            return len / 2;
        } else {
            return size;
        }
    }

    @Test
    public void distributeCandiesTest() {
        int[] candies = {1,1,2,2,3,3};
        System.err.println(distributeCandies(candies));
        int[] candies1 = {1,1,2,3};
        System.err.println(distributeCandies(candies1));
        int[] candies2 = {1,1,1,1};
        System.err.println(distributeCandies(candies2));
    }
}
