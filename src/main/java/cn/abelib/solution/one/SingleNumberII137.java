package cn.abelib.solution.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author abel-huang
 * @date 2016/7/19
 */
public class SingleNumberII137 {
    public static void main(String args[]) {
        int[] nums = {1, 22, 1, 22, 1, 22, 0};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map1.containsKey(nums[i])) {
                if (map2.containsKey(nums[i])) {
                    map1.remove(nums[i]);
                    map2.remove(nums[i]);
                } else {
                    map2.put(nums[i], i);
                }
            } else {
                map1.put(nums[i], i);
            }
        }
        Iterator<Integer> i = map1.keySet().iterator();

        return i.next();
    }
}
