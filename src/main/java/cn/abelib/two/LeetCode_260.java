package cn.abelib.two;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by  abel-huang on 2016/7/19.
 * But how to use Bit Manipulation for these questions rather
 * than Hashmap.
 */
public class LeetCode_260 {
    public static void main(String args[]) {
        int a[] = {1, 2, 1, 3, 2, 5};

        System.out.println(singleNumber(a));
    }

    public static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(new Integer(nums[i]))) {
                hashMap.remove(new Integer(nums[i]));
            } else {
                hashMap.put(new Integer(nums[i]), new Integer(i));
            }
        }
        int[] result = new int[2];
        Iterator<Integer> i = hashMap.keySet().iterator();

        result[0] = i.next().intValue();
        result[1] = i.next().intValue();
        return result;
    }
}
