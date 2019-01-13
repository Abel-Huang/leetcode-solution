package cn.abelib.explore.set;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: abel.huang
 * @Date: 2019-01-12 21:51
 */
public class HowToUseSet1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[Math.min(nums1.length, nums2.length)];
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                set2.add(i);
            }
        }
        int[] nums = new int[set2.size()];
        Iterator<Integer> iterator = set2.iterator();
        for (int i = 0; i < set2.size(); i ++){
            nums[i] = iterator.next();
        }
        return nums;
    }

    @Test
    public void intersectionTest() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {1, 2};
        Arrays.stream(intersection(nums1, nums2)).forEach(System.out::println);
    }
}
