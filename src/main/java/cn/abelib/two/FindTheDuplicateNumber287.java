package cn.abelib.two;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;


/**
 * @Author: abel.huang
 * @Date: 2019-01-12 16:32
 * 循环实现，性能比较差
 */
public class FindTheDuplicateNumber287 {
    /**
     *  使用数组循环的方式
     * @param nums
     * @return
     */
    public int findDuplicate1(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i ++) {
            for (int j = i + 1; j < len; j ++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    /**
     *  使用 set， 为什么使用了额外的空间也没有出错
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }
        return 0;
    }

    @Test
    public void findDuplicateTest() {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
