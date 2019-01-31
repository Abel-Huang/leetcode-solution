package cn.abelib.one;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author abel-huang
 * @date 2016/7/18
 * This is a easy question about hashtable, we can use hashmap function
 * to loop the target array, and the remaining one is the answer.
 * <p>
 * notes: the most important thing is how to loop a map, I mean how to
 * use iterator to solve this type of questions.
 */
public class SingleNumber136 {
    public int singleNumberWithMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

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
