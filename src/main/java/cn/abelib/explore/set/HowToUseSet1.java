package cn.abelib.explore.set;

import cn.abelib.util.annotation.Status;
import cn.abelib.util.enums.StatusEnum;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: abel.huang
 * @Date: 2019-01-12 21:51
 */
public class HowToUseSet1 {
    @Status(StatusEnum.ACCEPT)
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
}
