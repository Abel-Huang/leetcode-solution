package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by abel-huang on 2016/7/22.
 * I also use two hashmap to mark the number no matter it appear once or twice.
 */
public class LeetCode_80 {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
        System.out.print(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> second = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        for (int i = 0; i < nums.length; i++) {
            if (!first.containsKey(new Integer(nums[i]))) {
                first.put(new Integer(nums[i]), new Integer(i));
                list.add(new Integer(nums[i]));
            } else {
                if (!second.containsKey(new Integer(nums[i]))) {
                    second.put(new Integer(nums[i]), new Integer(i));
                    list.add(new Integer(nums[i]));
                }
            }
        }
        for (int i = 0; i < list.size(); i++)
            nums[i] = list.get(i);

        return list.size();
    }
}
