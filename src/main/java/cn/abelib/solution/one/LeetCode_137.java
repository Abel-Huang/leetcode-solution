package cn.abelib.solution.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by abel-huang on 2016/7/19.
 * if the first time the number appearance add to the first hashtable,
 * the second time appearance add to the second hashtable, and the third
 * time remove from both hashtables, and in the end of the loop, the remaining
 * element of the first hashmap will be the result.
 */
public class LeetCode_137 {
    public static void main(String args[]) {
        int nums[] = {1, 22, 1, 22, 1, 22, 0};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map1.containsKey(new Integer(nums[i]))) {
                if (map2.containsKey(new Integer(nums[i]))) {
                    map1.remove(new Integer(nums[i]));
                    map2.remove(new Integer(nums[i]));
                } else {
                    map2.put(new Integer(nums[i]), new Integer(i));
                }
            } else {
                map1.put(new Integer(nums[i]), new Integer(i));
            }
        }
        Iterator<Integer> i = map1.keySet().iterator();

        return i.next().intValue();
    }
}
