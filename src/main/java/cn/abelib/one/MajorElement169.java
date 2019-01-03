package cn.abelib.one;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abel on 2018/9/21.
 */
public class MajorElement169 {
    public int majorityElement(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
                if (map.get(num) > nums.length/2){
                    return num;
                }
            } else {
                map.put(num, 1);
            }
        }
        return 0;
    }

    @Test
    public void majorityElementTest() {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.err.println(result);
    }
}
