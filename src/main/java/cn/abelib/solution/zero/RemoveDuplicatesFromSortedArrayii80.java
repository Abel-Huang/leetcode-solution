package cn.abelib.solution.zero;

import java.util.*;

/**
 *
 * @author abel-huang
 * @date 2016/7/22
 * I also use two hashmap to mark the number no matter it appear once or twice.
 */
public class RemoveDuplicatesFromSortedArrayii80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i],  1);
            } else {
                map.put(nums[i], 2);
            }
        }
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                nums[index] = entry.getKey();
                index++;
                nums[index] = entry.getKey();
                index++;
            } else {
                nums[index] = entry.getKey();
                index++;
            }
        }

        return index;
    }
}
