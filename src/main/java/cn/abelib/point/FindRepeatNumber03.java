package cn.abelib.point;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: abel.huang
 * @Date: 2020-07-18 14:15
 */
public class FindRepeatNumber03 {
    /**
     * 使用hash
     * @param nums
     * @return
     */
    public int findRepeatNumberSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return i;
            } else {
                set.add(i);
            }
        }
        return nums[0];
    }

    /**
     * 使用额外数组
     * @param nums
     * @return
     */
    public int findRepeatNumberArray(int[] nums) {
        int n = nums.length;
        int[] set = new int[n];
        for (int i : nums) {
            if (set[i] == 1) {
                return i;
            } else {
                set[i] = 1;
            }
        }
        return nums[0];
    }
}
