package cn.abelib.solution.five;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2019-09-22 15:41
 */
public class RelativeRanks506 {
    public String[] findRelativeRanks(int[] nums) {
        int len = nums.length;
        int idx;
        String[] ranks = new String[len];
        int[] temp = Arrays.copyOf(nums, len);
        Arrays.sort(temp);
        Map<Integer, Integer> rankMap = new HashMap<>(len);
        for (int i = len - 1; i >= 0; i-- ) {
            rankMap.put(temp[i], len - i);
        }
        for (int i =0; i <len; i ++) {
            idx = rankMap.get(nums[i]);
            if (idx == 1) {
                ranks[i] = "Gold Medal";
            } else if (idx == 2) {
                ranks[i] = "Silver Medal";
            } else if (idx == 3) {
                ranks[i] = "Bronze Medal";
            } else {
                ranks[i] = idx + "";
            }
        }
        return ranks;
    }

    @Test
    public void findRelativeRanksTest() {
        int[] nums = {5, 4, 3, 2, 1};
        //System.err.println(Arrays.toString(findRelativeRanks(nums)));
        int[] nums1 = {10,3,8,9,4};
        System.err.println(Arrays.toString(findRelativeRanks(nums1)));
    }
}
