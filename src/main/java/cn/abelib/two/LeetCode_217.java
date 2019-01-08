package cn.abelib.two;

import java.util.HashMap;

/**
 * Created by  abel-huang on 2016/7/27.
 * Hashtable
 */
public class LeetCode_217 {
    public static void main(String args[]) {
        int haha[] = {1, 2, 3, 4, 2};
        System.out.println(containsDuplicate(haha));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(new Integer(nums[i]))) {
                hashMap.put(new Integer(nums[i]), new Integer(nums[i]));
            } else
                return true;
        }
        if (hashMap.size() == nums.length)
            return false;
        else
            return true;
    }
}
