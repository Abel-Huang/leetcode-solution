package cn.abelib.solution.twelve;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: abel.huang
 * @Date: 2019-12-05 22:29
 */
public class UniqueNumberOfOccurrences1207 {
    public boolean uniqueOccurrences(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return true;
        }
        int[] map = new int[2001];
        for (int i : arr) {
            map[i + 1000] ++;
        }
        Set<Integer> set = new HashSet<>();
        for (int i : map) {
            if (i == 0) {
                continue;
            }
            if (set.contains(i)) {
                return false;
            } else {
                set.add(i);
            }
        }
        return true;
    }

    @Test
    public void uniqueOccurrencesTest() {
        int[] arr1 = {1,2,2,1,1,3};
        System.err.println(uniqueOccurrences(arr1));

        int[] arr2= {1,2};
        System.err.println(uniqueOccurrences(arr2));

        int[] arr3= {-3,0,1,-3,1,1,1,-3,10,0};
        System.err.println(uniqueOccurrences(arr3));
    }
}
