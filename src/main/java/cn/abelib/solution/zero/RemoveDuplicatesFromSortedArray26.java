package cn.abelib.solution.zero;

import java.util.*;

/**
 *
 * @author abel-huang
 * @date 2016/7/12
 *
 */
public class RemoveDuplicatesFromSortedArray26 {
    public int removeDuplicatesWithHash(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i: nums) {
            linkedHashSet.add(i);
        }
        int index = 0;
        for (int i : linkedHashSet) {
            nums[index] = i;
            index++;
        }
        return index;
    }

    /**
     * better
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int index = 1;
        for (int i = 1; i <= nums.length - 1; i ++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index ++;
            }
        }
        return index;
    }
}
