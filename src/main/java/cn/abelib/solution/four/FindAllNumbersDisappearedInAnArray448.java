package cn.abelib.solution.four;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-09-22 00:36
 */
public class FindAllNumbersDisappearedInAnArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int now = 1;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (now == nums[i]) {
                continue;
            }
            if (now + 1 ==  nums[i]) {
                now ++;
                continue;
            }
            while (nums[i] - now > 1) {
                now++;
                result.add(now);
            }
            now ++;

        }
        return result;
    }

    @Test
    public void findDisappearedNumbersTest() {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        System.err.println(findDisappearedNumbers(nums1));

    }
}
