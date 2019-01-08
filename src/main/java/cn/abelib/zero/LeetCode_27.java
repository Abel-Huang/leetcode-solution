package cn.abelib.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abel-huang on 2016/7/17.
 * it's similar whit 26th and maybe much easier.
 */
public class LeetCode_27 {
    public static void main(String args[]) {
        int nums[] = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0)
            return 0;
        else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    list.add(new Integer(nums[i]));
                }
            }
            for (int i = 0; i < list.size(); i++) {
                nums[i] = list.get(i).intValue();
            }
            return list.size();
        }
    }
}
