package cn.abelib.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by  abel-huang on 2016/8/3.
 * Use hashtable, and the value store every index of the key.
 */
public class LeetCode_219 {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 1};
        System.out.print(containsNearbyDuplicate(nums, 6));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        if (nums.length <= 1)
            return false;
        else {
            for (int i = 0; i < nums.length; i++) {
                if (!hashMap.containsKey(new Integer(nums[i]))) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    hashMap.put(nums[i], list);
                } else {
                    hashMap.get(nums[i]).add(i);
                    for (int j = 0; j < hashMap.get(nums[i]).size(); j++) {
                        for (int n = j; n < hashMap.get(nums[i]).size(); n++) {
                            if (hashMap.get(nums[i]).get(n) - hashMap.get(nums[i]).get(j) <= k && n != j)
                                return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
