package cn.abelib.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by abel-huang on 2016/7/18.
 * This is a easy question about hashtable, we can use hashmap function
 * to loop the target array, and the remaining one is the answer.
 * <p>
 * notes: the most important thing is how to loop a map, I mean how to
 * use iterator to solve this type of questions.
 */
public class LeetCode_136 {
    public static void main(String args[]) {
        int nums[] = {1, 1, 22, 22, 0};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(new Integer(nums[i]))) {
                map.remove(new Integer(nums[i]));
            } else {
                map.put(new Integer(nums[i]), new Integer(i));
            }
        }
        Iterator<Integer> i = map.keySet().iterator();

        return i.next().intValue();
    }
}
