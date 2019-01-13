package cn.abelib.four;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2019-01-12 21:10
 * set去重，PriorityQueue排序
 */
public class ThirdMaximumNumber414 {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : nums) {
            queue.add(i);
        }
        Set<Integer> set = new HashSet<>();
        int max = queue.peek();
        while (queue.size() > 0) {
            int temp = queue.poll();
            set.add(temp);
            if (set.size() == 3) {
                return temp;
            }
        }
        return max;
    }

    @Test
    public void thirdMaxTest() {
        int[] nums = {1,2,2,3, 5 ,3 ,5,3,5};
        System.out.println( thirdMax(nums));
    }
}
