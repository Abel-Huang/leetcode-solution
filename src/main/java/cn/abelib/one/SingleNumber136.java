package cn.abelib.one;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author abel-huang
 * @date 2016/7/18
 */
public class SingleNumber136 {
    /**
     *  使用 HashMap
     * @param nums
     * @return
     */
    public int singleNumberWithMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(16);

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        Iterator<Integer> i = map.keySet().iterator();

        return i.next();
    }

    /**
     * 位运算，异或
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    @Test
    public void singleNumberTest() {
        int[] nums = {1, 1, 22, 22, 0};
        System.out.println(singleNumber(nums));
    }
}
