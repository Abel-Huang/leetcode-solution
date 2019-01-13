package cn.abelib.two;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2019-01-12 20:58
 */
public class MajorityElementII229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer) > nums.length / 3) {
                list.add(integer);
                if (list.size() == 2) {
                    break;
                }
            }
        }
        return list;
    }

    @Test
    public void majorityElementTest() {
        int[] nums = {};
        majorityElement(nums).forEach(System.out::println);
    }
}
