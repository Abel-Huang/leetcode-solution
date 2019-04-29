package cn.abelib.solution.six;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2019-01-07 00:53
 * HashMap
 */
public class DegreeOfAnArray697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, List<Integer>> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(nums[i])) {
                List<Integer> value = numMap.get(nums[i]);
                value.set(0, value.get(0) + 1);
                value.set(2, i);
                numMap.replace(nums[i], value);
            } else {
                List<Integer> value = new ArrayList<>(3);
                value.add(1);
                value.add(i);
                value.add(i);
                numMap.put(nums[i], value);
            }
        }
        int degree = 1;
        int len = 1;
        Iterator<Integer> iterator = numMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            List<Integer> temp = numMap.get(key);
            if (degree > temp.get(0)) {
                continue;
            } else if (degree < temp.get(0)) {
                degree = temp.get(0);
                len = temp.get(2) - temp.get(1) + 1;
            } else {
                len = Math.min(len, temp.get(2) - temp.get(1) + 1);
            }
        }
        return len;
    }

    @Test
    public void findShortestSubArrayTest() {
        int[] nums = {2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }
}
