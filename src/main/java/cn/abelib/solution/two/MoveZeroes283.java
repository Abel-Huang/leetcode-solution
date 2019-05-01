package cn.abelib.solution.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by  abel-huang on 2016/7/11.
 * use list
 */
public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.print(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) {
                list.add(num);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < list.size()) {
                nums[i] = list.get(i);
            } else {
                nums[i] = 0;
            }
        }
    }
}
