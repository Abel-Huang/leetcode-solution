package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abel-huang
 * @date 2016/7/17
 * it's similar whit 26th and maybe much easier.
 */
public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            if (i != val) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}
