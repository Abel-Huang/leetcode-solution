package cn.abelib.zero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by abel-huang on 2016/7/12.
 * I try many times and I get the right answer the length of this array,
 * but the test result must be return the right sort of the array.
 */
public class LeetCode_26 {
    public static void main(String args[]) {
        int nums[] = {1, 1, 2, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return 1;
        else {
            for (int i = 0; i < nums.length; i++) {
                if (!hashMap.containsKey(new Integer(nums[i]))) {
                    hashMap.put(new Integer(nums[i]), new Integer(i));
                    list.add(new Integer(nums[i]));
                }
            }
            for (int i = 0; i < hashMap.size(); i++) {
                nums[i] = list.get(i).intValue();
            }
            return hashMap.size();
        }
    }
}
