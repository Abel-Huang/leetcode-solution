package cn.abelib.solution.two;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author abel-huang
 * @date 2016/7/27
 * Hashtable
 */
public class ContainsDuplicate217 {
    public static void main(String args[]) {
        int[] haha = {1, 2, 3, 4, 2};
        System.out.println(containsDuplicate(haha));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                return true;
            }
        }
        return set.size() != nums.length;
    }

    public static boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 2) {
            return false;
        }
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
