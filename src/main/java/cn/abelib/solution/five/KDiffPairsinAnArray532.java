package cn.abelib.solution.five;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: abel.huang
 * @Date: 2020-07-26 18:04
 */
public class KDiffPairsinAnArray532 {
    public int findPairs(int[] nums, int k) {
        int len = nums.length;
        if (len < 2) {
            return 0;
        }
        if (len == 2) {
            if (Math.abs(nums[0] - nums[1]) == k) {
                return 1;
            }
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    set.add(Math.min(nums[i], nums[j]));
                }
            }
        }
        return set.size();
    }

    @Test
    public void findPairs2Test() {
        System.err.println(findPairs(new int[]{1, 3, 1, 5, 4}, 2));
        System.err.println(findPairs(new int[]{1, 3, 2, 5, 4}, 1));
        System.err.println(findPairs(new int[]{1, 3, 1, 5, 4}, 0));
        System.err.println(findPairs(new int[]{1, 3, 3, 5, 4}, 2));
    }
}
