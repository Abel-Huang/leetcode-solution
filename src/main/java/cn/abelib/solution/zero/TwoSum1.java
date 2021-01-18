package cn.abelib.solution.zero;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author abel-huang
 * @date 2016/7/6
 */
public class TwoSum1 {
    /**
     * 两层循环，不推荐
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        int tag = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    tag = 1;
                    break;
                }
            }
            if (tag == 1) {
                break;
            }
        }
        return result;
    }

    /**
     * 哈希表，推荐
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        int len = nums.length;
        if  (len < 2) {
            return new int[2];
        }
        Map<Integer, Integer> map = new HashMap<>(len / 2);
        int[] ans = new int[2];
        for(int i = 0; i < len; i ++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i < len; i ++) {
            int num = nums[i];
            if(map.containsKey(target - num)) {
                int idx = map.get(target - num);
                if (idx == i) {
                    continue;
                }
                ans[0] = i;
                ans[1] = idx;
                break;
            }
        }
        return ans;
    }

    @Test
    public void twoSum() {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }
}
